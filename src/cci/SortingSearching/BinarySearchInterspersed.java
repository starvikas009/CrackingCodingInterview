package cci.SortingSearching;

/**
 * Created by vkumar on 1/23/17.
 * 
 * Given a sorted array of strings which is interspersed with empty strings,
 * write a method to find the location of a given string.
 */
public class BinarySearchInterspersed {
    public static int search(String[] list, String k) {
        System.out.println("BinarySearchInterspersed: searching for string:" + k);
        return search(list, k, 0, list.length -1);
    }
    
    public static int search(String[] list, String k, int l, int u) {
        System.out.println("BinarySearchInterspersed: searching in l:" + l + " u:" + u);

        if(l > u) return -1;
        
        int m = (l + u)/2;
        m = findNonEmpty(list, m, l , u);
        if(m < l) {
            int m2 = (l + u)/2;
            return search(list, k, m2 + 1, u);
        }

        int cmp = k.compareTo(list[m]);
        if(cmp == 0) {
            return m;
        } else if(cmp < 0) {
            return search(list, k, l, m-1);
        } else {
            return search(list, k, m+1, u);
        }
    }
    
    public static int findNonEmpty(String[] list, int m, int l, int u) {
        int i = m;
        while (list[i].isEmpty() && i > 0 && i >= l) {
            i--;
        }

//        if(i >= l) {
//            return i;
//        }
//
//        i = m + 1;
//        while (list[i].isEmpty() && i <= u) {
//            i++;
//        }

        return i;
    }
}
