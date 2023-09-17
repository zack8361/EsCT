package LV1page2;

public class 수박박수수밥박수 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(solution(n));
    }

    private static String solution(int n) {
        String s = "수";
        String b = "박";
        String answer = "";

        for(int i =1; i<=n; i++){
            if(i%2 ==0){
                answer += b;
            }
            else {
                answer +=s;
            }
        }

        return answer;
    }
}
