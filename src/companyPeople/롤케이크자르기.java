package companyPeople;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class 롤케이크자르기 {
    public static void main(String[] args) {
        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};
        System.out.println(solution(topping));
    }

    private static int solution(int[] topping) {
        int answer = 0;
        HashMap<Integer,Integer> toppingMap = new HashMap<>();
        HashSet<Integer> toppingSet = new HashSet<>();
        for (int i : topping) {
            if(toppingMap.containsKey(i)){
                toppingMap.put(i,toppingMap.get(i) + 1);
            }
            else {
                toppingMap.put(i,1);
            }
        }

        for (int i : topping) {
            toppingMap.put(i,toppingMap.get(i)-1);
            toppingSet.add(i);
            if(toppingMap.get(i) == 0){
                toppingMap.remove(i);
            }
            if(toppingSet.size() == toppingMap.size()){
                answer++;
            }
        }
        return answer;
    }
}
