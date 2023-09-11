package LV1;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public static void main(String[] args) {
        long n = 12345;
        System.out.println(solution(n));
    }

    private static int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];


        int j = 0;
        for(int i=answer.length-1; i>=0; i--){
            answer[i] = Integer.parseInt(String.valueOf(str.charAt(j++)));
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
