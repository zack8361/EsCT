package LV1page2;

import java.util.Arrays;

public class 최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        System.out.println(solution(sizes));
    }

    private static int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            int num = 0;
            if(sizes[i][0] > sizes[i][1]){
                num = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = num;
            }
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < sizes.length; i++) {
            firstMax = Math.max(firstMax,sizes[i][0]);
            secondMax = Math.max(secondMax,sizes[i][1]);
        }
        return firstMax * secondMax;
    }
}
