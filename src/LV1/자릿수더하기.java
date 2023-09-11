package LV1;

public class 자릿수더하기 {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for(int i=0; i<str.length(); i++){
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return answer;
    }
}
