package cci.recursion;

/**
 * Created by vkumar on 1/22/17.
 */
public class PaintFill {
    public enum Color {
        White,
        Black,
        Red,
        Green,
        Yellow,
        Blue
    }

    public static void paintFill(Color[][] screen, int row, int col, Color oldColor, Color newColor) {
        if(oldColor == newColor) return; // nothing to be done.

        if(row < 0 || row >= screen.length) return; // index out of bound
        if(col < 0 || col >= screen[row].length) return; // index out of bound
        if(screen[row][col] != oldColor) return; // no operation needed. This pixel color is not same as oldColor.

        screen[row][col] = newColor;
        paintFill(screen, row, col + 1, oldColor, newColor);  // right pixel
        paintFill(screen, row, col - 1, oldColor, newColor);  // left pixel
        paintFill(screen, row + 1, col, oldColor, newColor);  // upper pixel
        paintFill(screen, row - 1, col, oldColor, newColor);  // lower pixel
    }
}
