package LV1;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        long n = 121;
        System.out.println(solution(n));
    }

    private static long solution(long n) {
        long answer = 0;

        for(long i=1; i<=n; i++){
            if(i*i == n){
                return (i+1) * (i+1);
            }
        }
        return -1;
    }
}
