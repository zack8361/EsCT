package LV1;

import java.util.Arrays;

public class 정수내림차순으로배치
{
    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }
    private static long solution(long n){
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str);
        String ans = "";

        for (int i = str.length-1; i >= 0; i--) {
            ans+=str[i];
        }

        return Long.parseLong(ans);
    }
}
