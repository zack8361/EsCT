package theBeum;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class 두개뽑아서더하기 {
    private static HashSet<Integer> set;
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        System.out.println(solution(numbers));
    }
    private static int[] solution(int[] numbers){
        set = new HashSet<>();
        dfs(2,0,0,0, numbers);

        int[] answer = new int[set.size()];

        int a = 0;
        for (int i : set) {
            answer[a++] = i;
        }
        Arrays.sort(answer);
        return answer;
    }

    private static void dfs(int i, int sum, int now, int depth, int[] numbers) {
        if(depth == i){
            set.add(sum);
            return;
        }
        for (int j = now; j < numbers.length; j++) {
            dfs(i,sum + numbers[j], j+1,depth+1,numbers);
        }
    }
}
