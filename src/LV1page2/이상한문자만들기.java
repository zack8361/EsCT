package LV1page2;



//공백이 많을때ㅔ처리해줘야함
public class 이상한문자만들기 {
    public static void main(String[] args) {
        String s = "heLLO myFriend  wKongkong";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            String midAns = "";

            for(int j=0; j<str[i].length(); j++){
                if( j ==0 ||j % 2 == 0 ){
                    midAns += String.valueOf(str[i].charAt(j)).toUpperCase();
                }
                else {
                    midAns += String.valueOf(str[i].charAt(j)).toLowerCase();
                }
            }
//           answer += midAns.strip() +=' ';
        }
        

        return answer.strip();

    }
}
