package ccitest.recursion;

import cci.recursion.Permutations;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
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

        // verification
        assertTrue(perms.size() == 2);
        Set<String> permsExpected = new HashSet<>(Arrays.asList("ab", "ba"));
        assertTrue(permsExpected.containsAll(perms));
    }

    @Test
    public void test3() {
        Set<String> perms = Permutations.getPerms("abc");

        // verification
        assertTrue(perms.size() == 6);
        Set<String> permsExpected = new HashSet<>(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
        assertTrue(permsExpected.containsAll(perms));
    }
}
