package ccitest.recursion;

import cci.recursion.PaintFill;
import cci.recursion.PaintFill.Color;
import org.junit.Test;

/**
 * Created by vkumar on 1/22/17.
 */
public class PaintFillTests {

    @Test
    public void test2() {
        PaintFill.Color[][] screen2 = {{Color.Green, Color.Black}, {Color.Black, Color.Black}};
        PaintFill.paintFill(screen2, 0, 1, Color.Black, Color.Blue);
    }
}
