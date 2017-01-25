package SortingSearching;

import cci.SortingSearching.BinarySearchRotatedArray;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 1/24/17.
 */
public class BinarySearchRotatedArrayTests {

    @Test
    public void testSmall1() {
        int[] nums = new int[] {0, 1, 2};
        assertTrue(BinarySearchRotatedArray.search(nums, 1) == 1);
    }

    @Test
    public void testSmall2() {
        int[] nums = new int[] {2, 0, 1};
        int idx = BinarySearchRotatedArray.search(nums, 1);
        assertTrue(idx == 2);
    }

    @Test
    public void testSmall3() {
        int[] nums = new int[] {2, 0, 1};
        int idx = BinarySearchRotatedArray.search(nums, 4);
        assertTrue(idx == -1);
    }

    @Test
    public void test4() {
        int[] nums = new int[] {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int idx = BinarySearchRotatedArray.search(nums, 5);
        assertTrue(idx == 8);
    }

    @Test
    public void test5() {
        int[] nums = new int[] {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int idx = BinarySearchRotatedArray.search(nums, 17);
        assertTrue(idx == -1);
    }

    @Test
    public void test6() {
        int[] nums = new int[] {2, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2};
        int idx = BinarySearchRotatedArray.search(nums, 3);
        assertTrue(idx == 7);
    }


    @Test
    public void test7() {
        int[] nums = new int[] {2, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2};
        int idx = BinarySearchRotatedArray.search(nums, 1);
        assertTrue(idx == -1);
    }
}
