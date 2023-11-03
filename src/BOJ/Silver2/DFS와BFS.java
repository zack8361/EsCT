package BOJ.Silver2;

import java.sql.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DFS와BFS {
    private static boolean[] visited;
    private static boolean[] visited2;
    private static StringBuilder dfsBuilder;
    private static StringBuilder bfsBuilder;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int startPoint = sc.nextInt();
        visited = new boolean[N];
        visited2 = new boolean[N];
        dfsBuilder = new StringBuilder();
        bfsBuilder = new StringBuilder();
        int[][] map = new int[N][N];
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a-1][b-1] = 1;
            map[b-1][a-1] = 1;
        }
        dfs(map,startPoint);
        String dfsAns = String.valueOf(dfsBuilder).trim();

        System.out.println(dfsAns);
        bfs(map,startPoint);
        String bfsAns = String.valueOf(bfsBuilder).trim();
        System.out.println(bfsAns);
    }

    private static void bfs(int[][] map, int startPoint) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(startPoint);
        visited2[startPoint-1] = true;
        while (!deque.isEmpty()){
            startPoint = deque.pollFirst();
            bfsBuilder.append(startPoint + " ");
            for (int i = 0; i < map.length; i++) {
                if(!visited2[i] && map[startPoint-1][i] == 1){
                    visited2[i] = true;
                    deque.addLast(i+1);
                }
            }
        }
    }

    private static void dfs(int[][] map, int startPoint) {
        dfsBuilder.append(startPoint + " ");
        visited[startPoint-1] = true;
        for (int i = 0; i < map.length; i++) {
            if(!visited[i] && map[startPoint-1][i] == 1) {
                visited[i] = true;
                dfs(map,i+1);
            }
        }

    }
}
