package kakao;

import java.util.Arrays;
import java.util.HashMap;

public class 로또의최고순위와최저순위 {
    public static void main(String[] args) {
        int[] lottos = {1,2,3,4,5,6};
        int[] win_nums = {7,8,9,10,11,12};
        System.out.println(solution(lottos,win_nums));
    }

    private static int[] solution(int[] lottos, int[] winNums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(6,1);
        map.put(5,2);
        map.put(4,3);
        map.put(3,4);
        map.put(2,5);
        map.put(1,6);
        map.put(0,6);
        Arrays.sort(lottos);
        Arrays.sort(winNums);

        int cnt = 0;
        int cntZero = 0;

        for (int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0){
                cntZero++;
                continue;
            }
            for (int j = 0; j < winNums.length; j++) {
                if(lottos[i] == winNums[j]){
                    cnt++;
                    break;
                }
            }
        }


        int firstNum = cntZero + cnt;
        int lastNum = cnt;


        if(lastNum == 0 || lastNum == 1){
            lastNum = 1;
        }

        int[] answer = new int[2];

        answer[0] = map.get(firstNum);
        answer[1] = map.get(lastNum);

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        return answer;
    }
}
