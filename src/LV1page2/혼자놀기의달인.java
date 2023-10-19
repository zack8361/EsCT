package LV1page2;

import java.util.ArrayList;
import java.util.HashMap;

public class 혼자놀기의달인 {
    public static void main(String[] args) {
        int[] cards = {8,6,3,7,2,5,1,4};
        System.out.println(solution(cards));
    }

    private static int solution(int[] cards) {
        int answer = 0;

        HashMap<Integer,Integer> cardMap = new HashMap<>();
        for (int i = 0; i < cards.length; i++) {
            cardMap.put(i+1,cards[i]);
        }

        for (int i = 0; i < cards.length; i++) {
            int start = cards[i];
            for (int j = 0; j < cards.length; j++) {
                try {
                    int coin = start;
                    start = cardMap.get(start);
                    cardMap.put(coin, 0);
                    System.out.println("start = " + start);
                }catch (Exception e){
                    break;
                }
            }
            System.out.println("----------------");
        }

        return  answer;
    }
}
