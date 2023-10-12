package kakao;

import java.util.Arrays;

public class 키패드누르기 {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution(numbers,hand));
    }

    private static String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] keyPad = {{1,2,3},{4,5,6},{7,8,9},{-1,0,-1}};

        for (int i = 0; i < keyPad.length; i++) {
            System.out.println(Arrays.toString(keyPad[i]));
        }


        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7){

            }
            else if(numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9){

            }
            else {

            }
        }

        return answer;
    }
}
