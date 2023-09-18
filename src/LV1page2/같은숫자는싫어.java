package LV1page2;

import java.util.ArrayDeque;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }

    private static int[] solution(int[] arr) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            if(deque.isEmpty()){
                deque.addLast(arr[i]);
            }
            else {
                if(deque.peekLast() == arr[i]){
                    continue;
                }
                else {
                    deque.addLast(arr[i]);
                }
            }
        }

        int[] answer = new int[deque.size()];
        int a = 0;
        for (Integer i : deque) {
            answer[a++] = i;
        }
        return answer;

    }
}
