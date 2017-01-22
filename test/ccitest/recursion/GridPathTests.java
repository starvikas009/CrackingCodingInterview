package ccitest.recursion;

import cci.recursion.GridPath;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 1/20/17.
 */
public class GridPathTests {
    @Test
    public void test1() {
        assertTrue(GridPath.pathCount(null) == 0);
        assertTrue(GridPath.pathCount(new boolean[0][]) == 0);

        boolean[][] grid1 = {{true, true}, {true, true}};
        assertTrue(GridPath.pathCount(grid1) == 2);
    }

    @Test
    public void test2() {
        boolean[][] grid1 = {{true, true}, {false, true}};
        assertTrue(GridPath.pathCount(grid1) == 1);
    }

    @Test
    public void test3() {
        boolean[][] grid1 = {{true, true, false}, {true, false, true}, {true, true, false}};
        assertTrue(GridPath.pathCount(grid1) == 0);
    }

    @Test
    public void test4() {
        boolean[][] grid1 = {{true, true, false}, {true, false, true}, {true, true, true}};
        assertTrue(GridPath.pathCount(grid1) == 1);
    }

    @Test
    public void test5() {
        boolean[][] grid1 = {{true, true, true}, {true, false, true}, {true, true, true}};
        assertTrue(GridPath.pathCount(grid1) == 2);
    }
}
