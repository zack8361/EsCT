package theBeum;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        System.out.println(solution(array,commands));
    }

    private static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int startIdx = commands[i][0];
            int endIdx = commands[i][1];
            int endPointIdx = commands[i][2];

            int ans = cacluate(startIdx, endIdx, endPointIdx, array);
            answer[i] = ans;
        }

        return answer;
    }

    private static int cacluate(int startIdx, int endIdx, int endPointIdx, int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = startIdx-1; i <= endIdx-1 ; i++) {
            list.add(array[i]);
        }
        if(list.size() != 0){
            Collections.sort(list);
            return list.get(endPointIdx-1);
        }
        return list.get(0);
    }
}
