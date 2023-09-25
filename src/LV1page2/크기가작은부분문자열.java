package LV1page2;

public class 크기가작은부분문자열 {
    public static void main(String[] args) {
        String t = "3141592";
        String p = "271";
        System.out.println(solution(t,p));
    }

    private static int solution(String t, String p) {
        int answer = 0;
        int len = p.length();

        for(int i =0; i<t.length()-len+1; i++){
            String ans = "";
            ans = t.substring(i, i+len);
            if(Long.parseLong(ans) <= Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}
