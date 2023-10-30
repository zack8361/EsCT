package BOJ.Silver3;

import java.util.Scanner;

public class OneTwoThree더하기 {

    private static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1,2,3};
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            cnt = 0;
            dfs(arr,num,0);
            System.out.println("cnt = " + cnt);
        }
    }

    private static void dfs(int[] arr, int num, int sum) {
        if(sum == num){
            cnt++;
            return;
        }
        if(sum>num){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            dfs(arr, num, sum + arr[i]);
        }
    }
}