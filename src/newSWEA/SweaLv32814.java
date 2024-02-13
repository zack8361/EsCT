package newSWEA;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 2814. 최장 경로 D3
 */
public class SweaLv32814 {
    private static boolean[] visited;
    private static int[][] network;
    private static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            network = new int[N][N];
            visited = new boolean[N];
            cnt = Integer.MIN_VALUE;
            for (int i = 0; i < M; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                network[a-1][b-1] = 1;
                network[b-1][a-1] = 1;
            }
            for(int i = 0; i< network.length; i++) {
                dfs(i,1);
                visited[i] = false;
            }
            System.out.println("#" + tc + " " + cnt);
        }
    }

    private static void dfs(int now,int count) {
        visited[now] = true;
        for (int i = 0; i < network.length; i++) {
            if(!visited[i] && network[now][i] == 1){
                dfs(i,count+1);
                visited[i] = false;
            }
        }

        cnt = Math.max(cnt,count);


    }
}
