package cci.SortingSearching;

/**
 * Created by vkumar on 1/23/17.
 * Given a matrix in which each row and each column is sorted, write a method to  nd an element in it.
 */
public class BinarySearchMatrix {
    public static boolean containsElement(int[][] mat, int k) {
        if(mat == null || mat.length == 0) return false;

        int i = mat.length -1;
        int j = 0;
        for(;i >=0 && j < mat[0].length;) {
            if(mat[i][j] == k) return true;
            if(mat[i][j] < k) {
                j++;
            } else {
                i--;
            }
        }

        return false;
    }
}



