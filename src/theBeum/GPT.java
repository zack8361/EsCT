package theBeum;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class GPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 보드의 크기 N
        int N = scanner.nextInt();

        // 사과의 개수 K
        int K = scanner.nextInt();

        // 보드 상에 사과의 위치를 저장하는 맵
        int[][] apples = new int[N][N];
        for (int i = 0; i < K; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            apples[x - 1][y - 1] = 1; // 사과의 위치를 1로 표시
        }

        // 뱀의 방향 전환 정보
        int L = scanner.nextInt();
        Map<Integer, Character> directionChanges = new HashMap<>();
        for (int i = 0; i < L; i++) {
            int time = scanner.nextInt();
            char direction = scanner.next().charAt(0);
            directionChanges.put(time, direction);
        }

        // 뱀의 초기 설정
        Queue<Point> snake = new ArrayDeque<>();
        snake.add(new Point(0, 0)); // 초기 위치
        int direction = 0; // 초기 방향 (오른쪽)

        int time = 0; // 게임이 시작한 후 경과한 시간

        // 게임 진행 시뮬레이션
        while (true) {
            time++;

            // 뱀의 머리 위치 계산
            Point head = snake.peek();
            int nextX = head.x + dx[direction];
            int nextY = head.y + dy[direction];

            // 게임 종료 조건 확인
            if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= N || isSnakeBody(snake, nextX, nextY)) {
                break;
            }

            // 뱀의 머리를 다음 위치로 이동
            snake.add(new Point(nextX, nextY));

            // 이동한 칸에 사과가 있는지 확인
            if (apples[nextX][nextY] == 1) {
                apples[nextX][nextY] = 0; // 사과를 먹었으므로 해당 칸의 사과를 없앰
            } else {
                // 사과가 없으면 꼬리를 줄임
                snake.poll();
            }

            // 방향 전환
            if (directionChanges.containsKey(time)) {
                direction = changeDirection(direction, directionChanges.get(time));
            }
        }

        // 게임 종료 시간 출력
        System.out.println(time);
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] dx = {0, 1, 0, -1}; // 동, 남, 서, 북
    static int[] dy = {1, 0, -1, 0};

    // 방향 전환 메서드
    static int changeDirection(int currentDirection, char turn) {
        if (turn == 'L') {
            return (currentDirection + 3) % 4; // 왼쪽으로 90도 회전
        } else {
            return (currentDirection + 1) % 4; // 오른쪽으로 90도 회전
        }
    }

    // 뱀의 몸체에 부딪힌 여부 확인
    static boolean isSnakeBody(Queue<Point> snake, int x, int y) {
        for (Point point : snake) {
            if (point.x == x && point.y == y) {
                return true;
            }
        }
        return false;
    }
}
