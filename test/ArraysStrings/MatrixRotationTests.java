package ArraysStrings;

import cci.ArraysStrings.MatrixRotation;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 2/13/17.
 */
public class MatrixRotationTests {
    @Test
    public void test1() {
        int[][] mat = new int[][] {{1,2}, {3, 4}};
        MatrixRotation.rotateMatrix(mat);
        assertTrue(mat[0][0] == 3);
    }
}
