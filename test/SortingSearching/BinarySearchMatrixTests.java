package SortingSearching;

import cci.SortingSearching.BinarySearchMatrix;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 1/27/17.
 */
public class BinarySearchMatrixTests {
    @Test
    public void test1() {
        int[][] mat = new int[][] {{1}};
        assertTrue(BinarySearchMatrix.containsElement(mat, 1));
    }

    @Test
    public void test21() {
        int[][] mat = new int[][] {{1, 2}, {3, 4}};
        assertTrue(BinarySearchMatrix.containsElement(mat, 1));
    }

    @Test
    public void test22() {
        int[][] mat = new int[][] {{1, 2}, {3, 4}};
        assertTrue(BinarySearchMatrix.containsElement(mat, 2));
    }

    @Test
    public void test23() {
        int[][] mat = new int[][] {{1, 2}, {3, 4}};
        assertTrue(BinarySearchMatrix.containsElement(mat, 3));
    }

    @Test
    public void test24() {
        int[][] mat = new int[][] {{1, 2}, {3, 4}};
        assertTrue(BinarySearchMatrix.containsElement(mat, 4));
    }
    
    @Test
    public void test25() {
        int[][] mat = new int[][] {{1, 2}, {3, 4}};
        assertTrue(!BinarySearchMatrix.containsElement(mat, 5));
    }
}
