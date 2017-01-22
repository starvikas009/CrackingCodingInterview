package ccitest.recursion;

import cci.recursion.Fibonacci;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by vkumar on 1/20/17.
 */
public class FibonacciTests {
    @Test
    public void test1() {
        Fibonacci f = new Fibonacci();
        assertTrue(f.fib(0) == 0);
        assertTrue(f.fib(1) == 1);
        assertTrue(f.fib(2) == 1);
        assertTrue(f.fib(3) == 2);
        assertTrue(f.fib(4) == 3);
        assertTrue(f.fib(5) == 5);
        assertTrue(f.fib(6) == 8);
    }

}
