package companyPeople;

import java.util.ArrayDeque;

public class 두큐합같게만들기 {
    public static void main(String[] args) {
        int[] queue1 = {1,1};
        int[] queue2 = {1,5};
        System.out.println(solution(queue1,queue2));
    }

    private static int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        ArrayDeque<Integer> deque1 = new ArrayDeque<>();
        ArrayDeque<Integer> deque2 = new ArrayDeque<>();
        for (int i = 0; i < queue1.length; i++) {
            deque1.addLast(queue1[i]);
            deque2.addLast(queue2[i]);
        }

        long sum1 = 0;
        long sum2 = 0;

        for(int j : deque1){
            sum1 +=j;
        }
        for(int j : deque2){
            sum2 +=j;
        }
        int limit = Math.max(queue1.length,queue2.length);

        for (int i = 0; i < limit; i++) {
            if(sum1>sum2){
                answer++;
                int num = deque1.pollFirst();
                sum1-=num;
                sum2+=num;
                deque2.addLast(num);
            }
            else if(sum1<sum2){
                answer++;
                int num = deque2.pollFirst();
                sum2-=num;
                sum1+=num;
                deque1.addLast(num);
            }
            else {
                break;
            }
        }
        if(answer == queue1.length + queue2.length){
            return -1;
        }
        return answer;
    }
}
