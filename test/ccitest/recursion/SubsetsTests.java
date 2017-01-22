package ccitest.recursion;

import cci.recursion.Subsets;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 1/21/17.
 */
public class SubsetsTests {

    @Test
    public void testNull() {
        Subsets t = new Subsets();
        assertTrue(t.allSubsets(null) == null);
    }

    @Test
    public void testEmpty() {
        Subsets t = new Subsets();
        assertTrue(t.allSubsets(new ArrayList<Integer>(){}).equals(new HashSet<>()));
    }
}
