package LV1page2;

import java.util.Arrays;

public class 예산 {

    public static void main(String[] args) {
        int[] d = {3,1,1};
        int budget = 3;
        System.out.println(solution(d,budget));
    }

    private static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        int sum = 0;

        for (int i = 0; i < d.length; i++) {
            System.out.println("sum = " + sum);
            if(sum<budget){
                sum+=d[i];
                count++;
            }
            else if(sum == budget){
                break;
            }
            else {
                
                count--;
                break;
            }
        }
        return count;
    }
}
