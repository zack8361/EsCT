package LV1page2;

public class 가운데글자가져오기 {
    public static void main(String[] args) {
        String s = "qwer";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";

        if(s.length()%2 == 1) {
            answer = String.valueOf(s.charAt(s.length() / 2));
        }
        else {
            answer =  String.valueOf(s.charAt(s.length()/2-1)) + String.valueOf(s.charAt(s.length()/2));
        }

        return answer;
    }
}
