package swea.D3;

import java.util.Arrays;
import java.util.Scanner;

public class View3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] charArr = str.toCharArray();

        int num = Integer.parseInt(new String(charArr));
        System.out.println("num = " + num);
    }
}
