package swea.D3;

import java.util.Arrays;
import java.util.Scanner;

public class S2805 {
    private static int sum;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t = 1; t<=tc; t++){
            int N = sc.nextInt();
            String[] arr = new String[N];
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.next();
            }
            String[][] map = new String[N][N];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = String.valueOf(arr[i].charAt(j));
                }
            }
            calculateMap(N/2,map);
            System.out.println("#" + t +" " + sum);
            sum = 0;
        }
    }

    private static void calculateMap(int startPoint, String[][] map) {
        for (int i = 0; i < map.length; i++) {
            sum += Integer.parseInt(map[startPoint][i]);
            map[startPoint][i] = "0";
        }
        for(int i = 1; i<=startPoint; i++){
            for (int j = i; j < map.length-i; j++) {
                sum += Integer.parseInt(map[startPoint+i][j]);
                map[startPoint+i][j] = "0";
                sum += Integer.parseInt(map[startPoint-i][j]);
                map[startPoint-i][j] = "0";
            }
        }
    }
}
