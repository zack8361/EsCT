package newSWEA;


import java.util.Scanner;

/**
 * SWEA-D3(2817) : 부분 수열의 합
 */
public class SweaLv32817 {
    private static int N;
    private static int K;
    private static int ans;
    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {
            ans = 0;
            N = sc.nextInt();
            K = sc.nextInt();
            arr = new int[N];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            dfs(0,0);

            System.out.println("#" + tc + " " + ans);
        }
    }

    private static void dfs(int sum, int now) {
        if(sum >= K){
            if(sum == K ){
                ans++;
            }
            return;
        }
        for (int i = now; i < arr.length; i++) {
            dfs(sum + arr[i],i+1);
        }

    }
}
