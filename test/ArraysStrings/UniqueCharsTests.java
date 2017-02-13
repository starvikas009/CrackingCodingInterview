package ArraysStrings;

/**
 * Created by vkumar on 2/12/17.
 */


import cci.ArraysStrings.UniqueChars;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class UniqueCharsTests {
    @Test
    public void test1() {
        assertTrue(UniqueChars.hasUniqueChars("asdf"));
        assertTrue(UniqueChars.hasUniqueChars("asdf".toCharArray()));
    }

    @Test
    public void test2() {
        assertTrue(!UniqueChars.hasUniqueChars("asdfs"));
        assertTrue(!UniqueChars.hasUniqueChars("asdfs".toCharArray()));
    }
}
