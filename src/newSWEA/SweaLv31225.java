package newSWEA;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 1225. [S/W 문제해결 기본] 7일차 - 암호생성기 D3
 */
public class SweaLv31225 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int tc = 1; tc <= 10; tc++) {
            int t = sc.nextInt();
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            int[] arr = new int[8];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                deque.addLast(arr[i]);
            }

            int i = 0;

            while (true) {
                i++;
                if(i == 6){
                    i = 1;
                }
                if(deque.peekFirst() - i <= 0) {
                    deque.pollFirst();
                    deque.addLast(0);
                    break;
                }
                else {
                    deque.addLast(deque.pollFirst() - i);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (Integer integer : deque) {
                sb.append(integer).append(" ");
            }
            String answer = String.valueOf(sb).trim();

            System.out.println("#" + tc + " " + answer);

        }
    }
}
