package swea.D3;

import java.util.Arrays;
import java.util.Scanner;

public class View {

    private static int sum = 0;
    private static int[] building;
    public static void main(String[] args) {
        for (int tc = 1; tc <= 10; tc++) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            building = new int[N];
            // 만약 입력받으면서 두개의
            for (int i = 0; i < N; i++) {
                building[i] = sc.nextInt();
            }
            for (int i = 2; i < N - 2; i++) {
                isViewRight(i);
            }
            System.out.println("#" + tc +" "+ sum);
            sum = 0;
        }
    }
    private static void isViewRight(int i) {
        int max = Integer.MIN_VALUE;
        int currentValue = building[i];
        if (building[i - 1] < building[i] && building[i - 2] < building[i] && building[i + 1] < building[i] && building[i + 2] < building[i]) {
            sum += currentValue - Math.max(max,Math.max(building[i-1],Math.max(building[i-2], Math.max(building[i+1], building[i+2]))));
        }
    }
}
