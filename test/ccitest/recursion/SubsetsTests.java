package ccitest.recursion;

import cci.recursion.Subsets;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 1/21/17.
 */
public class SubsetsTests {

    @Test
    public void testNull() {
        Subsets t = new Subsets();
        Set<Set<Integer>> subsets = t.allSubsets(null);
        assertTrue(subsets == null || subsets.isEmpty());
    }

    @Test
    public void testEmpty() {
        Subsets t = new Subsets();
        Set<Set<Integer>> subsets = t.allSubsets(new ArrayList<Integer>(){});

        // verification
        assertTrue(subsets.size() == 1);
        for(Set<Integer> s: subsets) {
            assertTrue(s.isEmpty()); // only one set which has to be empty set.
        }
    }

    @Test
    public void test1() {
        Subsets t = new Subsets();
        List<Integer> nums = Arrays.asList(1);
        Set<Set<Integer>> subsets = t.allSubsets(nums);

        // verification
        assertTrue(subsets.size() == 2);
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList())));
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList(1))));
    }

    @Test
    public void test2() {
        Subsets t = new Subsets();
        List<Integer> nums = Arrays.asList(1,2);
        Set<Set<Integer>> subsets = t.allSubsets(nums);

        // verification
        assertTrue(subsets.size() == 4);
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList())));
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList(1))));
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList(2))));
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList(1,2))));
    }


    @Test
    public void test3() {
        Subsets t = new Subsets();
        List<Integer> nums = Arrays.asList(1,2,3);
        Set<Set<Integer>> subsets = t.allSubsets(nums);

        // verification
        assertTrue(subsets.size() == 8);
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList())));
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList(1))));
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList(2))));
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList(3))));
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList(1, 2))));
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList(2, 3))));
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList(3, 1))));
        assertTrue(subsets.contains(new HashSet<>(Arrays.asList(1, 2, 3))));
    }
}
