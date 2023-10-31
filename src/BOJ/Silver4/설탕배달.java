package BOJ.Silver4;

import java.util.Scanner;

public class 설탕배달 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        int ans = 0;
        while (num > 0){
            if (num % 5 == 0) {
                num -= 5;
                ans++;
            } else if (num % 3 == 0) {
                num -= 3;
                ans++;
            } else if (num > 5) {
                num -= 5;
                ans++;
            } else {
                System.out.println(-1); // 배달이 불가능한 경우 -1을 출력
                return;
            }
        }
        System.out.println(ans);
    }
}
