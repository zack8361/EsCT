package newSWEA;

import java.util.Scanner;

/**
 * SWEA-D3 : [S/W 문제해결 기본] 5일차 - Magnetic
 */
public class SweaLv31220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            int n = sc.nextInt();
            int[][] map = new int[n][n];

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int cnt = 0;

            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if (map[i][j] == 0) continue;
                    else if(map[i][j] == 1) {
                        if(i + 1 == map.length) break;
                        if(map[i+1][j] == 2) {
                            cnt++;
                        }
                        else {
                            map[i+1][j] = map[i][j];
                        }
                    }
                }
            }
            System.out.println("#" + tc + " " + cnt);
        }
    }
}
