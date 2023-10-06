package kakao;

import java.util.*;

public class 실패율
{
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        System.out.println(solution(N,stages));
    }

    private static int[] solution(int n, int[] stages) {

        ArrayList<Double> list = new ArrayList<>();
        HashMap<Double,Integer> scoreMap = new HashMap<>();
        double ans = 0;
        double total = stages.length;
        Arrays.sort(stages);
        for (double i = 1; i <= n; i++) {
            double cnt = 0;
            for (double j = ans; j <stages.length ; j++) {
                if(i >= stages[(int) j]){
                    cnt++;
                    ans = j+1;
                }
            }
            scoreMap.put(cnt/total, (int) i);
            list.add(cnt/total);
            total-=cnt;
        }

        Collections.sort(list,Collections.reverseOrder());

        System.out.println("list = " + list);
        System.out.println("scoreMap = " + scoreMap);
        int[] answer = new int[n];
        int a = 0;
        for (Double v : list) {
            if(scoreMap.containsKey(v)){
                answer[a++] = scoreMap.get(v);
            }
        }
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));



        return new int[0];
    }
}
