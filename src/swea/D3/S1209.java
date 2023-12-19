package swea.D3;

import java.util.Arrays;
import java.util.Scanner;

public class S1209 {
    private static int max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc<=10; tc++){
            int t = sc.nextInt();
            int[][] map = new int[100][100];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            calculateMax(map);
            System.out.println("#"+tc +" " + max);
            max = 0;
        } 
    }

    private static void calculateMax(int[][] map) {
        for (int i = 0; i < map.length; i++) {
            int row = 0;
            int col = 0;
            for (int j = 0; j < map.length; j++) {
                row += map[i][j];
                col += map[j][i];
            }
            max = Math.max(row,col);
        }
        int leftDown = 0;
        int rightDown = 0;
        for (int i = 0; i < map.length; i++) {
            leftDown = map[i][i];
            rightDown = map[i][map.length-i-1];
        }
        max = Math.max(max,Math.max(leftDown,rightDown));
    }
}
