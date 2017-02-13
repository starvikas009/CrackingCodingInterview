package ArraysStrings;

import cci.ArraysStrings.ReverseString;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 2/12/17.
 */
public class ReverseStringTests {
    @Test
    public void test1() {
        char[] s = "asdf".toCharArray();
        ReverseString.reverse(s);
        assertTrue(String.copyValueOf(s).equals("fdsa"));
    }

    @Test
    public void test2() {
        char[] s = "a".toCharArray();
        ReverseString.reverse(s);
        assertTrue(String.copyValueOf(s).equals("a"));
    }

    @Test
    public void test3() {
        char[] s = "abc".toCharArray();
        ReverseString.reverse(s);
        assertTrue(String.copyValueOf(s).equals("cba"));
    }
}
