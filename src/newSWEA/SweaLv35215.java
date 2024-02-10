package newSWEA;

import java.util.Scanner;

/**
 * SWEA-D3 : 햄버거 다이어트
 * DFS, DP
 */
public class SweaLv35215 {
    private static int[] score;
    private static int[] cal;
    private static int limit;
    private static int max;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            limit = sc.nextInt();
            score = new int[n];
            cal = new int[n];
            max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                score[i] = sc.nextInt();
                cal[i] = sc.nextInt();
            }
            dfs(0,0,0);

            System.out.println("#" + t + " " + max);
        }
    }

    private static void dfs(int now,int scoreSum, int calSum) {
        if(calSum >= limit){
            return;
        }
        max = Math.max(max,scoreSum);

        for (int i = now; i < score.length; i++) {
            dfs(i+1,scoreSum + score[i], calSum + cal[i]);
        }
    }
}
