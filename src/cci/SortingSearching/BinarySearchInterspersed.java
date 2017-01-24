package cci.SortingSearching;

/**
 * Created by vkumar on 1/23/17.
 * 
 * Given a sorted array of strings which is interspersed with empty strings,
 * write a method to find the location of a given string.
 */
public class BinarySearchInterspersed {
    public static int search(String[] list, String k) {
        return search(list, k, 0, list.length -1);
    }
    
    public static int search(String[] list, String k, int l, int u) {
        if(l > u) return -1;
        
        int m = (l + u)/2;
        m = findNonEmpty(list, m);
        if(list[m].equals(k)) return m;
        
        int cmp = k.compareTo(list[m]);
        if(cmp == 0) {
            return m;
        } else if(cmp < 0) {
            return search(list, k, l, m-1);
        } else {
            return search(list, k, m+1, u);
        }
    }
    
    public static int findNonEmpty(String[] list, int i) {
        while (list[i].isEmpty() && i > 0) {
            i--;
        }
        
        return i;
    }
}
