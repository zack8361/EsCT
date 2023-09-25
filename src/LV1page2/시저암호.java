package LV1page2;

public class 시저암호 {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        System.out.println(solution(s,n));
    }

    private static String solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++){
            String an = "";
            if(s.charAt(i) != ' ') {
                int idx = (int) s.charAt(i);
                if(idx == 'Z'){
                    idx = 'A' -1;
                }
                else if(idx == 'z'){
                    idx = 'a'-1;
                }
                an = String.valueOf((char) idx);
            }
            System.out.println("an = " + an);
        }
        return answer;
    }
}
