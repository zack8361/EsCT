package LV1page2;


import java.util.Arrays;

//공백이 많을때ㅔ처리해줘야함
public class 이상한문자만들기 {
    public static void main(String[] args) {
        String s = "hello my name aaa  ";
        System.out.println(solution(s));
    }

    private static String solution(String s) {

        StringBuilder sb = new StringBuilder();
        String[] str = s.split("");

        int cnt = 0;

        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(" ")){
                cnt = 0;
            }
            else {
                cnt++;
            }
            if(cnt%2 == 0){
                sb.append(str[i].toUpperCase());
            }
            else {
                sb.append(str[i].toLowerCase());
            }
        }
        return String.valueOf(sb);
    }
}



//3,4,5 8,9,11,16