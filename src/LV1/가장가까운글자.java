package LV1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class 가장가까운글자 {
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(solution(s));
    }

    private static int[] solution(String s) {
        int len = s.length();
        HashMap<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if(map.containsKey(String.valueOf(s.charAt(i)))){
                int ans = i - map.get(String.valueOf(s.charAt(i)));
                list.add(ans);
            }
            else {
                list.add(-1);
            }
            map.put(String.valueOf(s.charAt(i)),i);
        }
        int[] ans = list.stream().mapToInt(Integer::intValue).toArray();

        return ans;
    }
}
