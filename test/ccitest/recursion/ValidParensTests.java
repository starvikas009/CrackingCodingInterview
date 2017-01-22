package ccitest.recursion;

import cci.recursion.ValidParens;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 1/22/17.
 */
public class ValidParensTests {
    @Test
    public void testEmpty() {
        Set<String> parens = ValidParens.getValidParenCombinations(0);
        assertTrue(parens.size() == 1);
        assertTrue(parens.contains(""));
    }

    @Test
    public void test1() {
        Set<String> parens = ValidParens.getValidParenCombinations(1);
        assertTrue(parens.size() == 1);
        assertTrue(parens.contains("()"));
    }
}
