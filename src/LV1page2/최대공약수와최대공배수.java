package LV1page2;

import java.util.Arrays;

public class 최대공약수와최대공배수 {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        System.out.println(solution(n,m));

    }

    private static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int a = gcd(n,m);
        int b = n*m / a;
        answer = new int[]{a,b};
        
        return answer;
    }

    private static int gcd(int n, int m) {
        if(m == 0){
            return n;
        }
        return gcd(m,n % m);
    }
}
