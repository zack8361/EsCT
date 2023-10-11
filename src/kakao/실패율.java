package kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 실패율
{
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2,1,2,6,2,4,3,3};
        System.out.println(solution(N,stages));
    }

    private static int[] solution(int N, int[] stages) {
        int[] answer = {};

        Arrays.sort(stages);
        int ans = 0;

        HashMap<Double,Integer> score = new HashMap<>();
        int totalScore = stages.length;
        for (int i = 1; i <= N; i++) {
            int failScore = 0;
            int cnt = 0;
            for (int j = ans; j < stages.length; j++) {
                if(stages[j]<=i){
                    cnt ++;
                    ans = j+1;
                }
            }

            System.out.println("cnt = " + cnt);
            score.put((double) (cnt/totalScore),i);
            totalScore -=cnt;
        }


        return answer;
    }
}
