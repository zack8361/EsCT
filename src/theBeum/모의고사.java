package theBeum;

import java.util.HashMap;
import java.util.HashSet;

public class 모의고사 {
    public static void main(String[] args) {
        int number = 5;
        int limit = 3;
        int power = 2;

        System.out.println(solution(number,limit,power));
    }

    private static int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++){
            if(measureSum(i) <= limit){
                answer += measureSum(i);
            }
            else {
                answer += power;
            }
        }
        return answer;
    }

    private static int measureSum(int i) {
        int cnt = 0;
        for (int j = 1; j <= i; j++) {
            if(i % j ==0) cnt++;
        }
        return cnt;
    }
}
