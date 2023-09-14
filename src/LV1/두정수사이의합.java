package LV1;

public class 두정수사이의합 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println(solution(a,b));
    }

    private static long solution(int a, int b) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        min = Math.min(a,b);
        max = Math.max(a,b);

        long sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }
}
