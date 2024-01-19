package theBeum;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.HashSet;

public class 카드뭉치 {
    public static void main(String[] args) {
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1,cards2,goal));
    }

    private static String solution(String[] cards1, String[] cards2, String[] goal) {

        HashMap<String,Integer> cardMap1 = new HashMap<>();
        HashMap<String,Integer> cardMap2 = new HashMap<>();

        for (int i = 0; i < cards1.length; i++) {
            cardMap1.put(cards1[i],i);
        }
        for (int i = 0; i < cards2.length; i++) {
            cardMap2.put(cards2[i],i);
        }

        String answer = "Yes";

        for (int i = 0; i < goal.length; i++) {
            if(cardMap1.containsKey(goal[i])){
                if(isCorrectWord(cardMap1, cardMap1.get(goal[i]))){
                    cardMap1.remove(goal[i]);
                }
                else {
                    answer = "No";
                    return answer;
                }
            }
            if(cardMap2.containsKey(goal[i])){
                if(isCorrectWord(cardMap2, cardMap2.get(goal[i]))){
                    cardMap2.remove(goal[i]);
                }
                else {
                    answer = "No";
                    return answer;
                }
            }
        }
        return answer;
    }
    private static boolean isCorrectWord(HashMap<String,Integer> map, int min){
        for (String s : map.keySet()) {
            if(map.get(s) < min){
                return false;
            }
        }
        return true;
    }
}
