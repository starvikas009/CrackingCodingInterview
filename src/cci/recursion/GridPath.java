package cci.recursion;

/**
 * Created by vkumar on 1/20/17.
 * Imagine a robot sitting on the upper left hand corner of an NxN grid.
 * The robot can only move in two directions: right and down. How many possible paths are there for the robot?

 FOLLOW UP
 Imagine certain squares are “off limits”, such that the robot can not step on them.
 Design an algorithm to get all possible paths for the robot.
 */
public class GridPath {
    public static long pathCount(boolean[][] grid) { // false means robot can not step on that location
        if(grid == null) return 0;
        int N = grid.length;
        if(N == 0 || N == 1) return 0;

        if(!grid[N-1][N-1]) return 0;

        Long[][] pathCountDP = new Long[N+1][N+1];
        initDP(grid, pathCountDP);
        computeDP(pathCountDP);
        return pathCountDP[0][0];
    }

    static void computeDP(Long[][] pathCountDP) {
        int N = pathCountDP.length;

        for (int i = N-1; i >= 0; i--) {
            for (int j = N-1; j >= 0; j--) {
                if(pathCountDP[i][j] != null) { // off limit or already computed.
                    continue;
                }

                pathCountDP[i][j] = pathCountDP[i+1][j] + pathCountDP[i][j+1];
            }
        }

    }

    static void initDP(boolean[][] grid, Long[][] pathCountDP) {
        int N = grid.length;
        pathCountDP[N-1][N-1] = 1l;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(!grid[i][j]) {
                    pathCountDP[i][j] = 0l;
                }
            }
        }

        for (int i = N; i >= 0; i--) {
            pathCountDP[i][N] = 0l;
            pathCountDP[N][i] = 0l;
        }
    }
}
