package LV1;


public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        String[] seoul = {"Jane","Kim"};
        System.out.println(solution(seoul));
    }

    private static String solution(String[] seoul) {
        String answer = "";
        int ans = 0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                ans = i;
            }
        }
        answer = "김서방은 " + String.valueOf(ans) +"에 있다";
        return answer;
    }
}
