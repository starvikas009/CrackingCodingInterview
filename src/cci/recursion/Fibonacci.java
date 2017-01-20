package cci.recursion;

/**
 * Created by vkumar on 1/20/17.
 */
public class Fibonacci {
    public long fib(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;

        long n1 = 0; // fib 0
        long n2 = 1; // fib 1
        for (int i = 2; i <= n; i++) {
            long n3 = n1 + n2;

            // progress
            n1 = n2;
            n2 = n3;
        }

        return n2;
    }
}
