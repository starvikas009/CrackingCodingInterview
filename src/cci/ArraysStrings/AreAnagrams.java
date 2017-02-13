package cci.ArraysStrings;

import java.util.Arrays;

/**
 * Created by vkumar on 2/12/17.
 */
public class AreAnagrams {
    public static boolean areAnagrams(String s1, String s2) {
        char[] a1 = s1.toCharArray();
        Arrays.sort(a1);
        String s11 = new String(a1);

        char[] a2 = s2.toCharArray();
        Arrays.sort(a2);
        String s22 = new String(a2);

        return s11.equals(s22);
    }
}
