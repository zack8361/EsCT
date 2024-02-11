package newSWEA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 진기의 최고급 붕어빵
 */
public class SweaLv31860 {
    private static int customer;
    private static int sec;
    private static int sep;
    private static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 1; tc <= t; tc++) {

            // 손님 수
            customer = sc.nextInt();

            // 초당
            sec = sc.nextInt();

            // 만들수 있는 붕어빵의 개수
            sep = sc.nextInt();

            arr = new int[customer];
            // 손님이 들어오는 시간
            for (int i = 0; i < customer; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

            String ans = "Possible";

            if(arr[0] < sec) {
                ans = "Impossible";
            }
            else {
                int totalFish = 0;
                for (int i = 0; i < customer; i++) {
                    int fish = (arr[i]/sec) * sep; // 현재 손님이 도착하는 시간까지의 붕어빵 수
                    int neededFish = i + 1; // 필요한 붕어빵의 갯수

                    totalFish += fish;
                    if(totalFish < neededFish) {
                        ans = "Impossible";
                        break;
                    }
                }
            }

            System.out.println("#" + tc +" " + ans);
        }
    }
}
