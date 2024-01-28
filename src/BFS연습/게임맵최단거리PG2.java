package BFS연습;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 게임맵최단거리PG2 {
    private static int[] dx = {1,0,-1,0};
    private static int[] dy = {0,1,0,-1};
    private static boolean[][] visited;
    public static void main(String[] args) {
        int[][] maps = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1},
                {0,0,0,0,1}
        };
        System.out.println(solution(maps));
    }

    private static class Node{
         int x;
         int y;
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    private static int solution(int[][] maps) {

        int[][] mapCopy = new int[maps.length][maps[0].length];
        visited = new boolean[maps.length][maps[0].length];
        mapCopy[0][0] = 1;
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0));
        visited[0][0] = true;


        while (!deque.isEmpty()) {
            Node now = deque.pollFirst();
            for (int k = 0; k < dx.length; k++) {
                int nx = now.x + dx[k];
                int ny = now.y + dy[k];

                if (nx < 0 || ny < 0 || nx >= maps.length || ny >= maps[0].length) {
                    continue;
                }

                if (maps[nx][ny] == 0) {
                    continue;
                }
                if(!visited[nx][ny] && maps[nx][ny] != 0){
                    deque.addLast(new Node(nx,ny));
                    visited[nx][ny] = true;
                    mapCopy[nx][ny] = mapCopy[now.x][now.y] + 1;
                }
            }
        }

        for (int i = 0; i < mapCopy.length; i++) {
            for (int j = 0; j < mapCopy[i].length; j++) {
                System.out.print(mapCopy[i][j]);
            }
            System.out.println();
        }
        if(mapCopy[maps.length-1][maps[0].length-1] == 0){
            return -1;
        }
        return mapCopy[maps.length-1][maps[0].length-1];
    }

}
