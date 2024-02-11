package newSWEA;

import java.util.Arrays;
import java.util.Scanner;

/**
 * [S/W 문제해결 기본] 3일차 - 회문1
 */
public class SweaLv31215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc<=10; tc++) {
            int len = sc.nextInt();
            String[][] map = new String[8][8];

            for (int i = 0; i < map.length; i++) {
                String str = sc.next();
                for (int j = 0; j < map.length; j++) {
                    map[i][j] = String.valueOf(str.charAt(j));
                }
            }
        }
    }
}
