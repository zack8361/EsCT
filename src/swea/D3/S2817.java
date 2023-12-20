package swea.D3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * SWEA D3 - 2817. 부분 수열의 합
 */
public class S2817 {
    private static int cnt;
    private static boolean [] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            int n = sc.nextInt();
            int totalNum = sc.nextInt();
            int[] arr = new int[n];
            visited = new boolean[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            dfs(arr,0,totalNum,0);
            System.out.println("#"+ tc + " " + cnt);
            cnt = 0;
        }
    }

    private static void dfs(int[] arr, int now, int totalNum, int sum) {
        if(sum>= totalNum){
            if(sum == totalNum){
                cnt++;
            }
            return;
        }
        for (int i = now; i < arr.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(arr, i, totalNum, sum + arr[i]);
                visited[i] = false;
            }
        }
    }
}
