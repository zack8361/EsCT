package newSWEA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * [S/W 문제해결 응용] 2일차 - 최대 상금
 */
public class SweaLv31244 {
    private static String[] arr;
    private static int changeCnt;
    private static int max;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            arr = sc.next().split("");
            changeCnt = sc.nextInt();
            max = Integer.MIN_VALUE;
            dfs(0,0);
            System.out.println("max = " + max);
        }
    }

    private static void dfs(int now, int cnt) {
        if(cnt == changeCnt){
            String result = "";
            for (String s : arr) {
                result += s;
            }
            System.out.println("result = " + result);
            max = Math.max(max,Integer.parseInt(result));
            return;
        }
        for (int i = now; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                dfs(i,cnt+1);
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
