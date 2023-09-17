package LV1;

import java.util.ArrayList;
import java.util.Collections;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int[] arr = {5,9,7,10};
        int divisor = 5;
        System.out.println(solution(arr,divisor));
    }

    private static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int a = 0;

        int[] notAnswer = {-1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor == 0){
                list.add(arr[i]);
            }
        }
        if(list.size() == 0){
            return notAnswer;
        }
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
