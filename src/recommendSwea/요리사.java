package recommendSwea;

import java.util.*;

/**
 * 성재형 추천 문제 1
 */
public class 요리사 {
    private static int[][] output;
    private static boolean[] visited;

    private static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        for (int tc = 1; tc<= t; t++) {
            N = sc.nextInt();
            int[][] arr = new int[N][N];
            visited = new boolean[N];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            output = arr;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            dfs(0,0);

        }
    }

    private static void dfs(int now, int cnt) {
        if(cnt == N/2) {
            int calculate = calculate();
            System.out.println(calculate);
            return;
        }

        for (int i = 0; i < N; i++) {
            visited[i] = true;
            dfs(i+1,cnt +1);
            visited[i] = false;
        }
    }

    private static int calculate() {
        int first = 0;
        int second = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i == j) {
                    continue;
                }
                if(visited[i] && visited[j]) {
                    first += output[i][j];
                }
                else if(!visited[i] && !visited[j]){
                    second += output[i][j];
                }
            }
        }
        return Math.abs(first - second);
    }
}

//10
//4
//0 5 3 8
//4 0 4 1
//2 5 0 3
//7 2 3 0