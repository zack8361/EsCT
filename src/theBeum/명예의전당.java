package theBeum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class 명예의전당 {
    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(solution(k,score));
    }

    private static int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] answer = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            if(pq.size() < 3){
                pq.add(score[i]);
                answer[i] = pq.peek();
            }
            else {
                if(score[i]>pq.peek()){
                    pq.poll();
                    pq.add(score[i]);
                }
                answer[i] = pq.peek();
            }
        }
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
