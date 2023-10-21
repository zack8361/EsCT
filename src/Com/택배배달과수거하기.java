package Com;

import java.util.Arrays;

public class 택배배달과수거하기 {
    public static void main(String[] args) {
        int cap = 4;
        int n = 5;
        int[] deliveries = {1,0,3,1,2};
        int[] pickups = {0,3,0,4,0};
        System.out.println(solution(cap,n,deliveries,pickups));
    }

    private static long solution(int cap, int n, int[] deliveries, int[] pickups) {

        long answer = 0;
        int a = 0;
        int b = 0;
        for (int i = deliveries.length-1; i >=0; i--) {
            deliveries[a++] = deliveries[i];
            pickups[b++] = pickups[i];
        }

        System.out.println(Arrays.toString(deliveries));
        System.out.println(Arrays.toString(pickups));

        while (true) {
            cap = 4;
            for (int i = 0; i < deliveries.length; i++) {
                System.out.println("deliveries = " + Arrays.toString(deliveries));
                if(deliveries[i] == 0 && pickups[i] == 0){
                    continue;
                }
                else {
                    if(cap>=deliveries[i]) {
                        cap -= deliveries[i];
                        deliveries[i] = 0;
                    }
                    else if(cap<deliveries[i]){
                        answer += (deliveries.length-i) * 2;
                        break;
                    }
                }
            }
            break;
        }
        System.out.println("cap = " + cap);
        System.out.println("answer = " + answer);
        return answer;
    }
}
