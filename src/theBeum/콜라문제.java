package theBeum;

public class 콜라문제 {
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int n = 20;
        System.out.println(solution(a,b,n));
    }

    private static int solution(int a, int b, int n) {
        int ans = 0;
        while (n>=a){
            System.out.println(n);
            ans += (n/a) * b;
            n = (n/a) * b + n%a;
        }
        return ans;
    }
}
