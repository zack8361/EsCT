package LV1;


// 나머지가 1이 되는 수 찾기.

public class ex01 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        int num = 2;

        while (true){
            if(n%num == 1){
                answer = num;
                break;
            }
            num++;
        }
        return answer;
    }
}
