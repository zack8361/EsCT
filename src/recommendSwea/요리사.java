package recommendSwea;

import java.util.*;

/**
 * 성재형 추천 문제 1
 */
public class 요리사 {
    private static int[] output;
    private static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();


        for (int tc = 1; tc<= t; t++) {
            int N = sc.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int max = Integer.MIN_VALUE;

            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (i != j) {
                        int abs = arr[i][j] + arr[j][i];
                        if(!list.contains(abs)) {
                            list.add(abs);
                        }
                    }
                }
                System.out.println();
            }

            output = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                output[i] = list.get(i);
            }
            visited = new boolean[output.length];

            int a = N/2;
            System.out.println(Arrays.toString(output));
            dfs(a,0,0,0);
        }
    }

    private static void dfs(int total, int sum,int depth,int now) {
        if(depth == total){
            System.out.println(sum);
            return;
        }
        for (int i = now; i < output.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                dfs(total, sum + output[i], depth + 1, i + 1);
                visited[i] = false;
            }
        }

    }
}
