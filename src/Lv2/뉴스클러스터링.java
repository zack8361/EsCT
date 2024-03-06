package Lv2;

import java.util.HashMap;
import java.util.HashSet;

public class 뉴스클러스터링 {

    private static HashSet<String> set;
    public static void main(String[] args) {
        String str1 = "F+RANCE";
        String str2 = "french";
        System.out.println(solution(str1,str2));
    }

    private static int solution(String str1, String str2) {
        set = new HashSet<>();
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        int current = 0;
        HashMap<String, Integer> map = new HashMap<>();

        addSet(str1);

        addSet(str2);
        System.out.println("set = " + set);


        return answer;
    }

    private static void addSet(String str){
        for (int i = 0; i < str.length()-2+1; i++) {
            String st = "";
            for (int j = i; j < 2+i; j++) {
                char ch = st.charAt(j);
                if(!Character.isLetter(ch)){
                    st = "";
                    break;
                }
                st += ch;
            }
            if(!st.isEmpty()){
                set.add(st);
            }
        }
    }
}
