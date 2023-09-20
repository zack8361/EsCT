package Com;

import java.util.Arrays;
import java.util.HashMap;

public class 달리기경주 {
    public static void main(String[] args){
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(solution(players,callings));
    }

    private static String[] solution(String[] players, String[] callings) {

        HashMap<String,Integer> map = new HashMap<>();
        HashMap<Integer,String> map1 = new HashMap<>();


        for(int i =0; i<players.length; i++){
            map.put(players[i],i+1);
            map1.put(i+1,players[i]);
        }

        for(int i=0; i<callings.length; i++){
            int rank = 0;
            int preRank = 0;
            String preUser = "";
            if(map.containsKey(callings[i])){
                rank = map.get(callings[i]);
                preRank = rank-1;
                preUser = map1.get(preRank);

                map.put(callings[i],preRank);
                map.put(preUser,rank);

                map1.put(preRank,callings[i]);
                map1.put(rank,preUser);
            }
        }
        String[] answer = new String[players.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = map1.get(i+1);
        }
        return answer;
    }
}
