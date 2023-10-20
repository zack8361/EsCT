package companyPeople;

import java.util.ArrayDeque;

public class 두큐합같게만들기 {
    public static void main(String[] args) {
        int[] queue1 = {3,2,7,2};
        int[] queue2 = {4,6,5,1};
        System.out.println(solution(queue1,queue2));
    }

    private static int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        ArrayDeque<Integer> deque1 = new ArrayDeque<>();
        ArrayDeque<Integer> deque2 = new ArrayDeque<>();

        int sum1 = 0;
        int sum2 = 0;

        for (int i : queue1) {
            sum1+=i;
            deque1.addLast(i);
        }
        for (int i : queue2) {
            sum2+=i;
            deque2.addLast(i);
        }


        while (true) {
            if(sum1 == sum2){
                break;
            }
            if(answer > queue1.length+queue2.length){
                return -1;
            }
            if(sum1> sum2){
                answer++;
                deque2.addLast(deque1.pollFirst());
            }
            else {
                System.out.println("hi1");
                answer++;
                deque1.addLast(deque2.pollFirst());
            }
            sum1 =0;
            sum2 = 0;
            for (int integer : deque1) {
                sum1+=integer;
            }
            for (int i : deque2) {
                sum2+=i;
            }

        }

        return answer;
    }
}
