package cci.recursion;

import java.util.Arrays;

/**
 * Created by vkumar on 1/22/17.
 */
public class MakeChange {
    public static int countWays(int total, int[] denominations) {
        if(total <0 ) return  0;
        if(total == 0) return  1;
        if(denominations == null || denominations.length == 0) return 0;

        Arrays.sort(denominations);
        return countWaysRecursive(total, denominations);
    }

    private static int countWaysRecursive(int total, int[] denominations) {
        if(total == 0) return  1;
        if(denominations.length == 0) return 0;

        int v = denominations[denominations.length-1]; // choose last denom
        int[] rest = Arrays.copyOf(denominations, denominations.length-1);
        int nWays = 0;
        for(int i = 0; i <= (total/v); i++) {
            int t = total - (i * v);
            nWays += countWaysRecursive(t, rest);
        }

        return nWays;
    }
}
