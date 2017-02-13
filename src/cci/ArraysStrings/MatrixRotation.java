package cci.ArraysStrings;

/**
 * Created by vkumar on 2/13/17.
 */
public class MatrixRotation {
    public static void rotateMatrix(int[][] mat) {
        if(mat.length == 0 || mat.length != mat[0].length) return;

        for(int layer = 0; layer < mat.length/2; layer++) { // one less than layer length
            rotateLayer(mat, layer);
        }
    }

    static void rotateLayer(int[][] mat, final int layer) {
        final int matLen = mat.length;
        final int layerLen = matLen - (2* layer);
        for(int i = 0; i < layerLen - 1; i++) { // one less than layer length
            rotatePixel(mat, layer, layer + i);
        }
    }

    static void rotatePixel(int[][] mat, final int r, final int c) {
        int N1 = mat.length - 1;
        int a1 = mat[r][c];
        // a1 = a4
        mat[r][c] = mat[N1- c][r];

        // a4 = a3
        mat[N1- c][r] = mat[N1 - r][N1- c];

        // a3 = a2
        mat[N1 - r][N1- c] = mat[c][N1 - r];

        // a2 = a1
        mat[c][N1 - r] = a1;
    }
}
