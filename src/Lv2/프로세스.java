package Lv2;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;

public class 프로세스 {
    public static void main(String[] args) {
        int[] priorities = {1,1,9,1,1,1};
        int location = 0;
        System.out.println(solution(priorities,location));
    }

    private static int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int priority : priorities) {
            priorityQueue.add(priority);
        }

        while (!priorityQueue.isEmpty()){
            System.out.println("prio = " + priorityQueue);
            for (int i = 0; i < priorities.length; i++) {
                if(priorities[i] == priorityQueue.peek()){
                    priorityQueue.poll();
                    answer++;
                    if(location == i) return answer;
                }
            }
        }

        return answer;
    }
}
