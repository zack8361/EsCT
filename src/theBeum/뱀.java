package theBeum;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class 뱀 {
    private static int time;
    private static int[] dx = {1,0,-1,0};
    private static int[] dy = {0,-1,0,1};

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


        for (int i = 0; i < apple; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            map[X][Y] = 1;
        }

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }

        int move = scanner.nextInt();
        ArrayDeque<Node> deque = new ArrayDeque<>();
        deque.addLast(new Node(0,0));

        boolean flag = false;
        for (int i = 0; i < move; i++) {
            int nowDir = 0;
            int X = scanner.nextInt();
            String direction = scanner.next();
            while (!deque.isEmpty()){
                Node now = deque.pollFirst();
                for (int j = 0; j < X; j++) {
                    time++;
                    int nx = now.x + dx[nowDir];
                    int ny = now.y + dy[nowDir];
                    if(nx<0 || ny<0 || nx>=map.length || ny>= map.length || map[nx][ny] == 2){
                        flag = true;
                        break;
                    }
                    map[nx][ny] = 2;
                }
                
                if(flag){
                    break;
                }
            }
            if(flag == true){
                break;
            }
        }
    }
}
