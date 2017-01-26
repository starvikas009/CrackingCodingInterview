package SortingSearching;

import cci.SortingSearching.StringAnagramSorting;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 1/24/17.
 */
public class StringAnagramSortingTests {
    boolean areAnagramTogether(String[] strs) {
        Map<String, List<String>> strToAnagram = new HashMap<>();
        Set<String> anagrams = new HashSet<>();
        String last = null;
        for (String s : strs) {
            String a = StringAnagramSorting.stringToNormalizedAnagram(s);

            if(a.equals(last)) {
                continue;
            } else {
                if(anagrams.contains(a)) {
                    return false;
                }

                anagrams.add(a);
                last = a;
            }
        }

        return true;
    }

    @Test
    public void test1() {
        String[] strs = new String[] {"ab", "ba", "abc"};
        strs = StringAnagramSorting.sortAnagramOrder(strs);
        assertTrue(areAnagramTogether(strs));
    }

    @Test
    public void test2() {
        String[] strs = new String[] {"ab", "bac", "abc", "dab", "asdf", "sdfa", "ba", "cab", "dafs"};
        strs = StringAnagramSorting.sortAnagramOrder(strs);
        assertTrue(areAnagramTogether(strs));
    }

    @Test
    public void test3() {
        String[] strs = new String[] {"ab", "bac", "abc", "dab", "asdf", "sdfa", "ba", "cab", "dafs", "dbad", "bad"};
        strs = StringAnagramSorting.sortAnagramOrder(strs);
        assertTrue(areAnagramTogether(strs));
    }
}
