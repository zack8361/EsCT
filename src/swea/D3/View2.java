package swea.D3;

import java.util.Scanner;

public class View2 {
    private static int maxNumber;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 1; t <= tc; t++) {
            char[] numArr = sc.next().toCharArray();
            int changeCnt = sc.nextInt();
            maxNumber = Integer.parseInt(new String(numArr));

            findMaxNumber(numArr, changeCnt, 0);

            System.out.println("#" + t + " " + maxNumber);
        }
    }
    private static void findMaxNumber(char[] arr, int changeCnt, int depth) {
        if (depth == changeCnt) {
            int num = Integer.parseInt(new String(arr));
            System.out.println("num = " + num);
            maxNumber = Math.max(maxNumber, num);
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    swap(arr, i, j);
                    findMaxNumber(arr, changeCnt, depth + 1);
                    swap(arr, i, j); // Backtrack
                }
            }
        }
    }
    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
