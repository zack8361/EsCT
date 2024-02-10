package newSWEA;

import java.util.Scanner;

/**
 * SWEA 1209 : [S/W 문제해결 기본]2일차 - SUM
 */
public class SweaLv31209 {
    private static int max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            max = Integer.MIN_VALUE;
            int[][] map = new int[100][100];
            int n = sc.nextInt();
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < map.length; i++) {
                int row = 0;
                int col = 0;
                for (int j = 0; j < map.length; j++) {
                    row += map[i][j];
                    col += map[j][i];
                }

                max = Math.max(row,col);
            }
            System.out.println("map = " + max);

        }
    }
}
//4 4 3 2 1
//2 2 1 6 5
//3 5 4 6 7
//4 2 5 9 7
//8 1 9 5 6
