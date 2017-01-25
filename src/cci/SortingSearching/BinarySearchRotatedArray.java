package cci.SortingSearching;

/**
 * Created by vkumar on 1/23/17.
 */
public class BinarySearchRotatedArray {

    public static int search(int a[], int x) {
        if(a == null || a.length == 0) return -1;

        System.out.println("BinarySearchRotatedArray Searching array for: " + x);
        return search(a, 0, a.length -1, x);
    }

    public static int search(int a[], int l, int u, int x) {
        System.out.println("Searching from: " + l + " to :" + u);
        if(l > u) return -1;
        if(l == u) {
            if(a[l] == x) return l;
            return -1;
        }

        int m = (l+u)/2;
        if(a[m] == x) return m;

        if(a[l] < a[m]) { // left is sorted normally
            if(a[l] <= x &&  x < a[m]) {
                // search left
                return search(a, l, m-1, x);
            } else {
                // search right
                return search(a, m+1, u, x);
            }
        } else if(a[m] < a[u]) { // right is sorted normally
            if(a[m] < x &&  x <= a[u]) {
                // search right
                return search(a, m+1, u, x);
            } else {
                // search left
                return search(a, l, m-1, x);
            }
        } else {
            int result = search(a, l, m-1, x); //left
            if(result >= 0) {
                return result;
            }
            else {
                return search(a, m + 1, u, x);
            }
        }
    }
}
