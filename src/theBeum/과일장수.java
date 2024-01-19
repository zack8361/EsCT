package theBeum;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 과일장수 {
    public static void main(String[] args) {
        int k = 3;
        int m = 4;
        int[] score = {1,2,3,1,2,3,1};
        System.out.println(solution(k,m,score));

    }

    private static int solution(int k, int m, int[] score) {

        int answer = 0;
        Arrays.sort(score);
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = score.length-1; i >=0; i--) {
            deque.add(score[i]);
            if (deque.size() == m){
                answer += isMin(deque);
                deque.clear();
            }
        }

        return answer;
    }

    private static int isMin(ArrayDeque<Integer> deque) {
        int min = Integer.MAX_VALUE;
        for (Integer i : deque) {
            min = Math.min(min,i);
        }
        System.out.println(min);
        return deque.size() * min;
    }
}
