package swea.D3;

import java.util.Arrays;
import java.util.Scanner;

public class S1216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int tc = 1; tc <= 10; tc++) {
            String[] arr = new String[5];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.next();
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}

/*

 */