package theBeum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class 실패율 {

    private static ConcurrentHashMap<Integer,Integer> stageMap;
    private static int people;
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        System.out.println(solution(N,stages));
    }

    private static int[] solution(int n, int[] stages) {

        people = stages.length;

        stageMap = new ConcurrentHashMap<>();


        for (int i = 0; i < stages.length; i++) {
            if(stageMap.containsKey(stages[i])){
                stageMap.put(stages[i], stageMap.get(stages[i]) + 1);
            }
            else {
                stageMap.put(stages[i],1);
            }
        }


        Double[] answer = new Double[n];
        HashMap<Double,Integer> map = new HashMap<>();
        for(int i = 1; i<=n; i++){
            double v = mapAccount(i);
            answer[i-1] = v;
            map.put(v,i);
        }
        
        return new int[0];
    }

    private static double mapAccount(int i) {
        double peo = 0;
        double ans = 0;
        for (Integer stage : stageMap.keySet()) {
            if(stage <= i){
                peo += stageMap.get(stage);
                stageMap.remove(stage);
            }
        }
        ans = peo/people;
        people -= peo;

        return ans;
    }
}
