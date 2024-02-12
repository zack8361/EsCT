package newSWEA;


import java.util.Scanner;

/**
 * 2814. 최장 경로 D3
 */
public class SweaLv32814 {
    private static boolean[] visited;
    private static int[][] network;
    private static int max = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int tc = 1; tc <= t; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            network = new int[N][N];
            visited = new boolean[N];

            for (int i = 0; i < M; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                network[a-1][b-1] = 1;
                network[b-1][a-1] = 1;
            }

            for (int i = 0; i < network.length; i++) {
                int dfs = dfs(i, 1);
                System.out.println("dfs = " + dfs);
                visited[i] = false;
            }
            System.out.println("max = " + max);

        }
    }

    private static int dfs(int now,int cnt) {
        visited[now] = true;

        for (int i = 0; i<network.length; i++){
            if(!visited[i] && network[now][i] == 1) {
                dfs(i,cnt+1);
            }
        }

        return cnt;
    }
}
