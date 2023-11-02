package BOJ.Silver3;

import java.util.Arrays;
import java.util.Scanner;

public class 바이러스 {
    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] virus = new int[N][N];
        visited = new boolean[N];

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            virus[a-1][b-1] = virus[b-1][a-1] = 1;
        }
        for (int i = 0; i < virus.length; i++) {
            System.out.println(Arrays.toString(virus[i]));
        }
        dfs(N,virus,0);

        int answer = 0;
        for (int i = 0; i < visited.length; i++) {
            if(visited[i]) answer++;
        }
        System.out.println(answer-1);
    }

    private static void dfs(int N, int[][] virus,int now) {

        visited[now] = true;
        for (int i = 0; i < virus.length; i++) {
            if(virus[now][i] == 1 && !visited[i]){
                dfs(N,virus,i);
            }
        }

    }
}
