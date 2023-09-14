package LV1;

public class 콜라츠추측 {

    public static void main(String[] args) {
        int num = 626331;
        System.out.println(solution(num));
    }

    private static int solution(int num) {
        int answer = 0;
        while (num != 1){
            if(num%2 == 0){
                num = num/2;
                answer++;
            }
            else if(num%2 == 1){
                System.out.println("sex");
                System.out.println(num);
                num = num*3 + 1;
                answer++;
            }
            if(answer == 500){
                return -1;
            }
        }
        return answer;
    }
}
