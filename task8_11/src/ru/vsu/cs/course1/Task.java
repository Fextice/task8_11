package ru.vsu.cs.course1;


public class Task {
    public static int[][] rotateMatrix(int[][] array) {
        int w = array.length;
        int h = array[0].length;
        int[][] ret = new int[h][w];
        for (int i = 0; i < h; ++i) {
            for (int j = 0; j < w; ++j) {
                ret[i][j] = array[w - j - 1][i];
            }
        }
        return ret;
    }
}

