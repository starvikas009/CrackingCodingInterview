package cci.ArraysStrings;

/**
 * Created by vkumar on 2/12/17.
 */
public class ReverseString {
    public static void reverse(char[] s) {
        for(int i = 0; i < s.length/2; i++) {
            char t = s[i];
            int j = s.length - 1 - i;
            s[i] = s[j];
            s[j] = t;
        }
    }
}
