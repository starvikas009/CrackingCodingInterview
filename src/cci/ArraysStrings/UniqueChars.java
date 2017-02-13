package cci.ArraysStrings;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vkumar on 2/12/17.
 */
public class UniqueChars {
    public static boolean hasUniqueChars(String s) {
        Set<Character> seenChars = new HashSet<>();
        for(char c : s.toCharArray()) {
            if(seenChars.contains(c)) {
                return false;
            }

            seenChars.add(c);
        }

        return true;
    }

    public static boolean hasUniqueChars(char[] s) {
        for(int i = 1; i < s.length; i++) {
            for(int j = 0; j < i; j++) {
                if(s[i] == s[j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
