package newSWEA;

import java.util.Scanner;

public class SweaLv31493 {
    public static void main(String[] args) {
        int N = 5;
        int[][] map = new int[N][N];

        int num = 1;
        int startRow = 0;
        int startCol = 0;

        while (num <= N * N) {
            int row = startRow;
            int col = startCol;

            while (row < N && col >= 0) {
                map[row++][col--] = num++;
            }

            if (startCol < N - 1) {
                startCol++;
            } else {
                startRow++;
            }
        }

        // 배열 출력
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
