package kakao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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
        String[][] map = new String[N][2];
        Arrays.sort(stages);
        int ans = 0;

        HashMap<Double,Integer> score = new HashMap<>();
        double totalScore = stages.length;
        for (int i = 1; i <= N; i++) {

            double cnt = 0;
            for (int j = ans; j < stages.length; j++) {
                if(stages[j]<=i){
                    cnt ++;
                    ans = j+1;
                }
            }
            map[i-1][0] = String.valueOf(cnt/totalScore);
            map[i-1][1] = String.valueOf(i);
            totalScore -=cnt;
        }
        Arrays.sort(map, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                double failRate1 = Double.parseDouble(o1[0]);
                double failRate2 = Double.parseDouble(o2[0]);

                if (failRate1 == failRate2) {
                    int stage1 = Integer.parseInt(o1[1]);
                    int stage2 = Integer.parseInt(o2[1]);
                    return Integer.compare(stage1, stage2);
                } else {
                    return Double.compare(failRate2, failRate1);
                }
            }
        });
        int[] realAns = new int[map.length];
        for (int i = 0; i < map.length; i++) {
            realAns[i] = Integer.parseInt(map[i][1]);
        }


        return realAns;
    }
}
