package cci.ArraysStrings;

/**
 * Created by vkumar on 2/12/17.
 */
public class RemoveDuplicates {
    public static int removeDuplicates(char[] s) {
        if(s == null || s.length == 0) return 0;

        int read = 1;
        int write = 1;
        for(;read < s.length; read++) {
            if(!isDuplicate(s, read)) {
                s[write] = s[read];
                write++;
            }
        }

        return write; // length of new string.
    }

    public static boolean isDuplicate(char[] s, final int i) {
        for(int j = 0; j < i; j++) {
            if(s[i] == s[j]) {
                return true;
            }
        }

        return false;
    }

}
