package LV1;

public class 콜라츠추측 {

    public static void main(String[] args) {
        long num = 626331;
        System.out.println(solution(num));
    }

    private static long solution(long num) {
        long answer = 0;
        while (num != 1){
            System.out.println("answer = " + answer);
            if(num%2 == 0){
                answer++;
                num = num/2;
            }
            else if(num%2 == 1){
                answer++;
                num = num*3 + 1;
            }
            if(answer == 500){
                return -1;
            }
        }

        return answer;
    }
}
