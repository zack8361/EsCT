package LV1;

import java.util.ArrayList;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        System.out.println(solution(arr));
    }

    private static int[] solution(int[] arr) {

        int[] notAnswer = {-1};
        if(arr.length == 1){
            return notAnswer;
        }

//        여기서부터 진짜 식
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            min = Math.min(min,arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != min){
                list.add(arr[i]);
            }
        }
        int[] answer = list.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
