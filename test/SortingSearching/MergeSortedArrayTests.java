package SortingSearching;

import cci.SortingSearching.MergeSortedArray;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 1/24/17.
 */
public class MergeSortedArrayTests {

    public static int[] mergeArrays(int[] A, int N, int[] B) {
        ArrayList<Integer> C = new ArrayList<>();
        for(int x: Arrays.copyOf(A, N)) {
            C.add(x);
        }

        for(int x: B) {
            C.add(x);
        }

        C.sort((x, y) -> Integer.compare(x, y));

        int[] D = new int[N + B.length];
        for (int i = 0; i < C.size(); i++) {
            D[i] = C.get(i);
        }

        return D;
    }

    @Test
    public void test1() {
        int[] A = new int[] {1, 2, 8, 0, 0, 0};
        int[] B = new int[] {4, 5, 6};
        int[] C = mergeArrays(A, 3, B);
        MergeSortedArray.mergeInplace(A, 3, B);
        assertTrue(Arrays.equals(C, A));
    }

    @Test
    public void test2() {
        int[] A = new int[] {1, 2, 8, 0, 0, 0};
        int[] B = new int[] {0, 5, 9};
        int[] C = mergeArrays(A, 3, B);
        MergeSortedArray.mergeInplace(A, 3, B);
        assertTrue(Arrays.equals(C, A));
    }

    @Test
    public void test3() {
        int[] A = new int[] {11, 12, 18, 0, 0, 0};
        int[] B = new int[] {0, 3, 9};
        int[] C = mergeArrays(A, 3, B);
        MergeSortedArray.mergeInplace(A, 3, B);
        assertTrue(Arrays.equals(C, A));
    }

    @Test
    public void test4() {
        int[] A = new int[] {11, 12, 18, 0, 0, 0};
        int[] B = new int[] {20, 23, 29};
        int[] C = mergeArrays(A, 3, B);
        MergeSortedArray.mergeInplace(A, 3, B);
        assertTrue(Arrays.equals(C, A));
    }

    @Test
    public void test5() {
        int[] A = new int[] {0, 0, 0};
        int[] B = new int[] {20, 23, 29};
        int[] C = mergeArrays(A, 0, B);
        MergeSortedArray.mergeInplace(A, 0, B);
        assertTrue(Arrays.equals(C, A));
    }

    @Test
    public void test6() {
        int[] A = new int[] {11, 12, 18};
        int[] B = new int[] {};
        int[] C = mergeArrays(A, 3, B);
        MergeSortedArray.mergeInplace(A, 3, B);
        assertTrue(Arrays.equals(C, A));
    }

}
