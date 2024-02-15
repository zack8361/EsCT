package newProgrammers.hash;


import java.util.*;

/**
 * 고득점 KIT(Hash) - 베스트 앨범(Lv3)
 */
public class 베스트앨범 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};

        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(solution(genres,plays));
    }

    private static int[] solution(String[] genres, int[] plays) {

        int N = genres.length;
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String, List<Integer>> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();


        for (int i = 0; i < N; i++) {
            map2.put(plays[i],i);
            if (map.get(genres[i]) == null) {
                map.put(genres[i], plays[i]);
                List<Integer> newList = new ArrayList<>();
                newList.add(plays[i]);
                map1.put(genres[i],newList);
            } else {
                map.put(genres[i], map.get(genres[i]) + plays[i]);
                List<Integer> existingList = map1.get(genres[i]);
                existingList.add(plays[i]);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        // 점수가 가장 높은 음악 두개를 골라 내야 한다.
        for (Integer value : map.values()) {
            list.add(value);
        }
        Collections.sort(list);


        String[] str = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int ans = list.get(list.size()-1-i);
            for (String s : map.keySet()) {
                if(map.get(s) == ans){
                    str[i] = s;
                }
            }
        }

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i =0; i<str.length; i++) {
            for (String s : map1.keySet()) {
                if(str[i].equals(s)) {
                    List<Integer> list1 = map1.get(s);
                    Collections.sort(list1);
                    if(list1.size()>=2){
                        list2.add(list1.get(list1.size()-1));
                        list2.add(list1.get(list1.size()-2));
                    }
                    else {
                        list2.add(list1.get(0));
                    }
                }
            }
        }

        
        // 정답 체크 로직
        int[] answer = new int[map.size() * 2];
        int a = 0;

        for (Integer i : list2) {
            if(map2.containsKey(i)) {
                answer[a++] = map2.get(i);
            }
        }


        return answer;
    }
}
