package ccitest.recursion;

import cci.recursion.MakeChange;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by vkumar on 1/22/17.
 */
public class MakeChangeTests {
    static int[] getDenoms() {
        return new int[]{1, 5, 10, 25}; // cents
    }

    @Test
    public void test0() {
        assertTrue(MakeChange.countWays(0, getDenoms()) == 1);
    }

    @Test
    public void test1() {
        assertTrue(MakeChange.countWays(1, getDenoms()) == 1);
    }

    @Test
    public void test5() {
        assertTrue(MakeChange.countWays(5, getDenoms()) == 2);
    }

    // https://www.algebra.com/algebra/homework/word/coins/Word_Problems_With_Coins.faq.question.152564.html

    @Test
    public void test100() {
        // https://www.freemathhelp.com/forum/threads/49517-How-many-ways-can-you-give-coins-in-change-for-1
        assertTrue(MakeChange.countWays(100, getDenoms()) == 242);
    }

    @Test
    public void test100_2() {
        assertTrue(MakeChange.countWays(100, new int[]{5, 10, 25}) == 29);
    }

    @Test
    public void test100_3() {
        assertTrue(MakeChange.countWays(100, new int[]{1, 5, 10, 25, 50}) == 292); // NO $1 COIN/BILL
    }

    @Test
    public void test50() {
        /// https://www.algebra.com/algebra/homework/word/coins/Word_Problems_With_Coins.faq.question.536548.html
        assertTrue(MakeChange.countWays(50, new int[]{1, 5, 10, 25}) == 49);
    }
}
