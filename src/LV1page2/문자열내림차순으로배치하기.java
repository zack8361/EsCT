package LV1page2;

import java.util.Arrays;


// gfedcbZ
public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str);
        for (int i = str.length-1; i >=0; i--) {
            answer+=str[i];
        }


        return answer;
    }
}
