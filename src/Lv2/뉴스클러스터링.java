package Lv2;

import java.util.HashMap;
import java.util.HashSet;

public class 뉴스클러스터링 {
    private static int count;

    private static double cnt;
    private static HashSet<String> set;
    private static HashMap<String ,Integer> map;
    public static void main(String[] args) {
        String str1 = "FRANCE";
        String str2 = "french";
        System.out.println(solution(str1,str2));
    }

    private static int solution(String str1, String str2) {
        set = new HashSet<>();
        map = new HashMap<>();
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        addSet(str1);
        count++;
        addSet(str2);

        Double sum = (double) set.size();
        answer = (int) ((cnt / sum) * 65336);
        return answer;
    }

    private static void addSet(String str){
        for (int i = 0; i < str.length()-2+1; i++) {
            String st = "";
            for (int j = i; j < 2+i; j++) {
                char ch = str.charAt(j);
                if(!Character.isLetter(ch)){
                    st = "";
                    break;
                }
                st += ch;
            }
            if (count == 1 && set.contains(st)){
                cnt++;
            }
            if(!st.isEmpty()){
                set.add(st);
            }
        }
    }
}
