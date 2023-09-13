package LV1;

public class 두정수사이의합 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a,b));
    }

    private static long solution(int a, int b) {

        int num = 0;
        if(a<b){
            num = a;
            a = b;
            b = num;
            b -=num;
        }
        else {
            num = a;
        }
        long sum = 0;
        for(int i=num; i<=b; i++){
            sum+=i;
        }
        return sum;
    }
}
