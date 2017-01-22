package ccitest.recursion;

import cci.recursion.Permutations;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 1/21/17.
 */
public class PermutationsTests {
    @Test
    public void testEmpty() {
        Set<String> perms = Permutations.getPerms("");
        assertTrue(perms.size() == 1);
    }

    @Test
    public void test1() {
        Set<String> perms = Permutations.getPerms("a");
        assertTrue(perms.size() == 1);
    }

    @Test
    public void test2() {
        Set<String> perms = Permutations.getPerms("ab");
        assertTrue(perms.size() == 2);
    }
}
