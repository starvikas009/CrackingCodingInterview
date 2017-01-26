package cci.SortingSearching;

import java.util.*;

/**
 * Created by vkumar on 1/23/17.
 *
 * Write a method to sort an array of strings so that all the anagrams are next to each other.
 *
 */
public class StringAnagramSorting {

    public static String[] sortAnagramOrder(String[] strs) {
        Map<String, List<String>> strToAnagram = new HashMap<>();
        for(String s: strs) {
            String a = stringToNormalizedAnagram(s);

            if(!strToAnagram.containsKey(a)) {
                strToAnagram.put(a, new ArrayList<>());
            }

            strToAnagram.get(a).add(s);
        }

        ArrayList<String> anagramTogether = new ArrayList<>();

        for(String a: strToAnagram.keySet()) {
            anagramTogether.addAll(strToAnagram.get(a));
        }

        return anagramTogether.toArray(strs);
    }

    public static String[] sortAnagramOrder2(String[] strs) {
        Arrays.sort(strs, (s1, s2 ) -> compareStringsAnagramOrder(s1, s2));
        return strs;
    }

    public static int compareStringsAnagramOrder(String s1, String s2) {
        String a1 = stringToNormalizedAnagram(s1);
        String a2 = stringToNormalizedAnagram(s2);
        return a1.compareTo(s2);
    }

    public static String stringToNormalizedAnagram(String s) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String a1 = new String(s1);
        return a1;
    }
}
