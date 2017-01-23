package cci.SortingSearching;

/**
 * Created by vkumar on 1/23/17.
 *
 * You are given two sorted arrays, A and B,
 * and A has a large enough buffer at the end to hold B.
 * Write a method to merge B into A in sorted order.
 */
public class MergeSortedArray {
    public static void mergeInplace(int[] largeBuffer, int N, int[] B) {
        int c = N + B.length - 1;
        int b = B.length -1;
        int a = N -1;
        for(;a >= 0 && b >= 0;) {
            if(largeBuffer[a] > B[b]) {
                largeBuffer[c] = largeBuffer[a];
                c--;
                a--;
            } else {
                largeBuffer[c] = B[b];
                c--;
                b--;
            }
        }

        // now put rest of B (if any left) in largeBuffer
        for(;b >= 0;) {
            largeBuffer[c] = B[b];
            c--;
            b--;
        }
    }
}
