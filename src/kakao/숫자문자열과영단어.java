package kakao;

import java.util.ArrayList;
import java.util.HashMap;

public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        String answer = "";
        int[] numArr = {0,1,2,3,4,5,6,7,8,9};
        String[] numString = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        HashMap<String ,Integer> strMap = new HashMap<>();
        HashMap<Integer,String > numMap = new HashMap<>();

        for (int i = 0; i < numArr.length; i++) {
            numMap.put(numArr[i],numString[i]);
            strMap.put(numString[i],numArr[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if(isNumber(String.valueOf(s.charAt(i)))){
                list.add(Integer.valueOf(String.valueOf(s.charAt(i))));
                continue;
            }
            else {
                ans += s.charAt(i);
            }
            if(strMap.containsKey(ans)){
                list.add(strMap.get(ans));
                ans = "";
            }
        }
        for (Integer integer : list) {
            answer +=String.valueOf(integer);
        }
        return Integer.parseInt(answer);
    }
    private static boolean isNumber(String s) {
        try{
            Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            return false;
        }
        return true;
    }
}
