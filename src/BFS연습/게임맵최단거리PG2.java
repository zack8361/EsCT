package BFS연습;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 게임맵최단거리PG2 {
    private static int[] dx = {1,0,-1,0};
    private static int[] dy = {0,1,0,-1};
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
        int answer = 0;

        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0));


        while (!deque.isEmpty()) {
            Node now = deque.pollFirst();
            for (int k = 0; k < dx.length; k++) {
                int nx = now.x + dx[k];
                int ny = now.y + dy[k];

                if (nx < 0 || ny < 0 || nx >= maps.length || ny >= maps.length) {
                    continue;
                }
                if (maps[nx][ny] == 0) {
                    continue;
                }
                if(maps[nx][ny] == 1) {
                    deque.addLast(new Node(nx, ny));
                    maps[nx][ny] = maps[now.x][now.y] + 1;
                }
            }
        }

        return maps[maps.length-1][maps.length-1] == 0 ? - 1 : maps[maps.length-1][maps.length-1];
    }

}
