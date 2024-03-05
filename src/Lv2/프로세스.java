package Lv2;

import java.util.ArrayDeque;

public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {2,1,3,2};
        int location = 2;
        System.out.println(solution(priorities,location));
    }

    private static int solution(int[] priorities, int location) {
        int answer = 0;
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int priority : priorities) {
            deque.addLast(priority);
        }
        
        return answer;
    }
}
