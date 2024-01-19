package theBeum;

import java.util.HashSet;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,3};
        System.out.println(solution(nums));
    }

    private static int solution(int[] nums) {
        int answer = nums.length/2;
        HashSet<Integer> pocketMon = new HashSet<>();
        for (int num : nums) {
            pocketMon.add(num);
        }


        // 3 >= 2
        if(pocketMon.size() >= answer){
            return pocketMon.size();
        }

        return answer;
    }
}
