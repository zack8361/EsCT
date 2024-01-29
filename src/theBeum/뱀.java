package theBeum;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class 뱀 {
    private static int time;
    private static int[] dx = {0,1,0,-1};
    private static int[] dy = {1,0,-1,0};
    private static boolean[][] visited;

    private static class Node{
        private int x;
        private int y;
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 보드 크기 N x N
        int N = scanner.nextInt();
        int apple = scanner.nextInt();
        int[][] map = new int[N][N];
        visited = new boolean[N][N];


        for (int i = 0; i < apple; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            map[X][Y] = 1;
        }

        int move = scanner.nextInt();
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0));
        visited[0][0] = true;
        boolean flag = false;

        // 뱀의 방향 인덱스
        int dir = 0;
        for (int i = 0; i < move; i++) {
            int X = scanner.nextInt();
            String direction = scanner.next();
            while (!deque.isEmpty()){
                Node now = deque.pollFirst();
                for (int j = 0; j < X; j++) {
                    time++;
                    int nx = now.x + dx[dir];
                    int ny = now.y + dy[dir];
                    if(nx<0 || ny<0 || nx>=map.length || ny >= map.length){
                        flag = true;
                        break;
                    }
                    if(map[nx][ny] == 1){
                        map[nx][ny] = 0;
                        visited[nx][ny] = true;
                    }
                    if(map[nx][ny] == 0) {
                        visited[now.x][now.y] = false;
                        visited[nx][ny] = true;
                    }
                    System.out.println("좌표 :"  + nx + "/" + ny);
                    deque.addLast(new Node(nx,ny));
                }
                if(direction.equals("D")){
                    dir = (dir + 1) % 4; // 시계 방향으로 회전
                }
                else {
                    dir = (dir + 3) % 4; // 반시계 방향으로 회전
                }
                if(flag){
                    break;
                }3
            }
            if(flag){
                break;
            }
        }
        System.out.println(time);
    }
}
