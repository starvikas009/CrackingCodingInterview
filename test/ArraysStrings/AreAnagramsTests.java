package ArraysStrings;

import cci.ArraysStrings.AreAnagrams;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 2/13/17.
 */
public class AreAnagramsTests {
    @Test
    public void test1() {
        assertTrue(AreAnagrams.areAnagrams("asdf", "afds"));
    }

    @Test
    public void test2() {
        assertTrue(!AreAnagrams.areAnagrams("asdf", "afdss"));
    }
}
