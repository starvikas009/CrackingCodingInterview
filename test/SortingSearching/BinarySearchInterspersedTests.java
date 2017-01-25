package SortingSearching;

import cci.SortingSearching.BinarySearchInterspersed;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 1/24/17.
 */
public class BinarySearchInterspersedTests {
    @Test
    public void test1() {
        String[] lst = new String[] {"a", "", "", "b", "c", "", "", "cd"};
        assertTrue(BinarySearchInterspersed.search(lst, "c") == 4);
    }

    @Test
    public void test2() {
        String[] lst = new String[] {"a", "", "", "b", "c", "", "", "cd"};
        assertTrue(BinarySearchInterspersed.search(lst, "a") == 0);
    }

    @Test
    public void test3() {
        String[] lst = new String[] {"a", "", "", "b", "c", "", "", "cd"};
        assertTrue(BinarySearchInterspersed.search(lst, "b") == 3);
    }

    @Test
    public void test4() {
        String[] lst = new String[] {"a", "", "", "b", "c", "", "", "cd"};
        assertTrue(BinarySearchInterspersed.search(lst, "cd") == 7);
    }

    @Test
    public void test5() {
        String[] lst = new String[] {"a", "", "", "b", "c", "", "", "cd"};
        assertTrue(BinarySearchInterspersed.search(lst, "z") == -1);
    }

    @Test
    public void test6() {
        String[] lst = new String[] {"a", "", "", "b", "c", "", "", "cd"};
        assertTrue(BinarySearchInterspersed.search(lst, "bb") == -1);
    }
}
