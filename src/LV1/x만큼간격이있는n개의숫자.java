package LV1;

import java.util.Arrays;

public class x만큼간격이있는n개의숫자 {
    public static void main(String[] args) {
        int x = -4;
        int n = 2;
        System.out.println(solution(x,n));
    }

    private static long[] solution(int x, int n) {
        long[] answer = new long[n];

        long j = 0;
        for(long i=1; i<=n; i++){
            answer[(int) j++] = x*i;
        }
        return answer;
    }
}
