package theBeum;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class 뱀 {
    private static int time;
    private static int[] dx = {0,1,0,-1};
    private static int[] dy = {1,0,-1,0};

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
            int X = scanner.nextInt();
            String direction = scanner.next();
        }
    }
}
