package companyPeople;

import java.util.ArrayList;
import java.util.Collections;
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

        ArrayList<Integer> ansList = new ArrayList<>();
        System.out.println("cardMap = " + cardMap);
        for (int i = 0; i < cards.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int nowCard = cards[i];
            if(cardMap.get(nowCard) == 0){
                continue;
            }
            for (int j = 0; j < cards.length; j++) {
                try {
                    int kong = nowCard;
                    nowCard = cardMap.get(nowCard);
                    cardMap.put(kong, 0);
                    if(nowCard != 0){
                        list.add(nowCard);
                    }
                }
                catch (Exception e){
                    break;
                }
            }
            ansList.add(list.size());
        }
        Collections.sort(ansList);

        if(ansList.size() == 1){
            return 0;
        }
        return ansList.get(ansList.size()-1) * ansList.get(ansList.size()-2);
    }
}
