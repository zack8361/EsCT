package newProgrammers.hash;

import java.util.*;

public class 베스트앨범2트 {
    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};

        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(solution(genres,plays));
    }

    private static int[] solution(String[] genres, int[] plays) {
        HashMap<Integer,Integer> idxMap = new HashMap<>();
        HashMap<String,List<Integer>> scoresMap = new HashMap<>();
        HashMap<String,Integer> scoreMap = new HashMap<>();

        for(int i = 0; i < genres.length; i++){
            if(scoreMap.get(genres[i]) == null){
                scoreMap.put(genres[i],plays[i]);
                List<Integer> list = new ArrayList<>();
                list.add(plays[i]);
                scoresMap.put(genres[i],list);
            }
            else {
                scoreMap.put(genres[i],scoreMap.get(genres[i]) + plays[i]);
                List<Integer> list = scoresMap.get(genres[i]);
                list.add(plays[i]);
                scoresMap.put(genres[i],list);
            }
            idxMap.put(plays[i],i);
        }


        System.out.println("idxMap = " + idxMap);
        System.out.println("scoreMap = " + scoreMap);
        System.out.println("scoresMap = " + scoresMap);

        // value 별로 정렬
        ArrayList<Integer> scoreList = new ArrayList<>();
        for (Integer value : scoreMap.values()) {
            scoreList.add(value);
        }
        Collections.sort(scoreList);

        String[] scoreGenre = new String[scoreList.size()];
        for(int i = 0; i<scoreList.size(); i++){
            
        }



        return new int[0];

    }
}
