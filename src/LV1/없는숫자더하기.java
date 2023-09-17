package LV1;

import java.util.HashMap;
import java.util.HashSet;

public class 없는숫자더하기 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] numbers) {
        int answer = 0;
        int[] ansArr = {1,2,3,4,5,6,7,8,9};


        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < ansArr.length; i++) {
            set.add(ansArr[i]);
        }

        for (int i = 0; i < numbers.length; i++) {
            if(set.contains((Object) numbers[i])){
                set.remove((Object) numbers[i]);
            }
        }

        for (Integer i : set) {
            if(i != 0){
                answer +=i;
            }
        }

        return answer;
    }
}
