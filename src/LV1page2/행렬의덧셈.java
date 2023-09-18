package LV1page2;

import java.util.Arrays;

public class 행렬의덧셈 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        System.out.println(solution(arr1,arr2));
    }

    private static int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[2][2];


        for (int i = 0; i < answer.length; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
        return new int[0][0];
    }
}
