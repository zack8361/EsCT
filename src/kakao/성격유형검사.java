package kakao;


import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * 1	매우 비동의  -> 네오형 3점
 * 2	비동의    -> 네오형 2점
 * 3	약간 비동의   -> 네오형 1점
 * 4	모르겠음    -> 어떤 성격 유형도 점수를 얻지 못함
 * 5	약간 동의    -> 어피치형 1점
 * 6	동의        -> 어피치형 2점
 * 7	매우 동의    -> 어피치형 3점
 */
public class 성격유형검사 {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5,3,2,7,5};
        System.out.println(solution(survey,choices));
    }

    private static String solution(String[] survey, int[] choices) {

        String[] board = {"RT","CF","JM","AN"};
        HashMap<String,Integer> map = new HashMap<>();

        map.put("A",0);
        map.put("N",0);
        map.put("C",0);
        map.put("F",0);
        map.put("M",0);
        map.put("J",0);
        map.put("R",0);
        map.put("T",0);

        HashMap<Integer,Integer> scoreMap = new HashMap<>();
        scoreMap.put(1,3);
        scoreMap.put(2,2);
        scoreMap.put(3,1);
        scoreMap.put(7,3);
        scoreMap.put(6,2);
        scoreMap.put(5,1);


        for (int i = 0; i < survey.length; i++) {
            if(choices[i] >4){
                int score = scoreMap.get(choices[i]);
                String person = String.valueOf(survey[i].charAt(1));
                map.put(person,map.get(person) + score);
            }
            else if(choices[i]<4) {
                int score = scoreMap.get(choices[i]);
                String person = String.valueOf(survey[i].charAt(0));
                map.put(person,map.get(person) + score);
            }
            else {
                continue;
            }
        }

        String answer = "";
        int max = 0;
        for (int i = 0; i < board.length; i++) {
            String per1 = String.valueOf(board[i].charAt(0));
            String per2 = String.valueOf(board[i].charAt(1));
            if(map.get(per1)> map.get(per2)){
                answer +=per1;
            }
            else if(map.get(per1) < map.get(per2)){
                answer +=per2;
            }
            else {
                answer += per1;
            }
        }
        System.out.println("answer = " + answer);

        return answer;
    }
}
