package cci.recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by vkumar on 1/21/17.
 */
public class Permutations {
    public static Set<String> getPerms(String s) {
        if(s == null) return null; /// error condition
        if(s.length() == 0) return new HashSet<String>(Arrays.asList(s));
        return getPerms(s);
    }

    private static Set<String> getPermsRecursive(String s) {
        Set<String> perms = new HashSet<>();
        if(s.length() == 0) {
            perms.add(""); // return set containing one empty string.
            return perms;
        }

        char first = s.charAt(0);

        // "emptiness".substring(9) returns "" (an empty string)
        String tail = s.substring(1); // so string of length 1 will be handled; result in an empty string
        Set<String> permsTail = getPermsRecursive(tail);
        for(String s1: permsTail) {
            // for each permutation of subString create L+1 permutations where L is size of substring.
            perms.addAll(createLargerPermutation(first, s1));
        }

        return perms;
    }

    private static Set<String> createLargerPermutation(char first, String rest) {
        Set<String> perms = new HashSet<>();
        int L = rest.length();
        for(int l = 0; l <= L; l++) {
            String permCurrent = rest.substring(0, l) + first + rest.substring(l, L);
            perms.add(permCurrent);
        }

        return perms;
    }
}
