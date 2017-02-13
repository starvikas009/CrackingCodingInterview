package ArraysStrings;

import cci.ArraysStrings.RemoveDuplicates;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 2/12/17.
 */
public class RemoveDuplicatesTests {
    @Test
    public void test1() {
        char[] s = "asdf".toCharArray();
        int len = RemoveDuplicates.removeDuplicates(s);
        assertTrue(String.copyValueOf(s, 0, len).equals("asdf"));
    }

    @Test
    public void test2() {
        char[] s = "assdsdfadsf".toCharArray();
        int len = RemoveDuplicates.removeDuplicates(s);
        assertTrue(String.copyValueOf(s, 0, len).equals("asdf"));
    }
}
