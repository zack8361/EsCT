package LV1page2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 대충만든자판 {
    public static void main(String[] args) {
        String[] keymap = {"ABCDE"};
        String[] targets = {"FGHIJ"};
        System.out.println(solution(keymap,targets));
    }

    private static int[] solution(String[] keymap, String[] targets) {
        ArrayList<Integer> list = new ArrayList<>();
//        첫번째 map;
        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < keymap.length; i++) {
            for(int j=0; j<keymap[i].length(); j++){
                if(map.get(String.valueOf(keymap[i].charAt(j))) == null){
                    map.put(String.valueOf(keymap[i].charAt(j)),j+1);
                }
                else {
                    if(map.get(String.valueOf(keymap[i].charAt(j)))>j){
                        map.put(String.valueOf(keymap[i].charAt(j)),j+1);
                    }
                }
            }
        }
        System.out.println("map = " + map);

        int realAns = 0;

        for(int i=0; i<targets.length; i++){
            int ans = 0;
            for(int j=0; j<targets[i].length(); j++){
                if(map.containsKey(String.valueOf(targets[i].charAt(j)))){
                    ans += map.get(String.valueOf(targets[i].charAt(j)));
                }
                else {
                    ans = 0;
                    break;
                }
            }
            if(ans == 0){
                list.add(-1);
            }
            else {
                list.add(ans);
            }
        }

        System.out.println("list = " + list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
