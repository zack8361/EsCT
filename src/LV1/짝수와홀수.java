package LV1;

public class 짝수와홀수 {
    public static void main(String[] args) {
        int num  = 3;
        System.out.println(solution(num));
    }

    private static String solution(int num) {
        String answer = "";

        num = Math.abs(num);
        if(num%2 == 1){
            answer = "Odd";
        }
        else {
            answer ="Even";
        }
        return answer;
    }
}
