package BOJ.SolvedRecommend;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/workbook/top

public class RGB거리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][3];

        dfs(0,0,0,board);
    }

    private static void dfs(int depth , int sum, int now, int[][] board) {
        if(depth == board.length){
            System.out.println("sum = " + sum);
            return;
        }
        for (int i = 0; i < 3; i++) {
            if(now != i){
                dfs(depth + 1,sum + board[depth][i] , i,board);
            }
        }
    }
}
