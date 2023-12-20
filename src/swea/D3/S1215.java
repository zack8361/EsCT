package swea.D3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 문제해결 3일차 - 회문 1 (D3)
 */
public class S1215 {
    private static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc<=10; tc++){
            int len = sc.nextInt();
            String[] str = new String[8];
            for (int i = 0; i < str.length; i++) {
                str[i] = sc.next();
            }
            String[][] map = new String[str.length][str.length];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    map[i][j] = String.valueOf(str[i].charAt(j));
                }
            }
            for(int i = 0; i< map.length; i++){
                for (int j = 0; j < map.length -len+1; j++) {
                    String word = "";
                    String word1 = "";
                    for (int k = j; k < len+j; k++) {
                        word += map[i][k];
                        word1 += map[k][i];
                    }
                    isPalindrome(word);
                    isPalindrome(word1);
                }
            }
            System.out.println("#" + tc + " " + cnt);
            cnt = 0;
        }
    }

    private static void isPalindrome(String word) {
        int len = word.length()/2;
        String str1 = "";
        String str2 = "";
        for (int i = 0; i <len; i++) {
            str1 += word.charAt(i);
            str2 += word.charAt(word.length()-i-1);
        }
        if(str1.equals(str2)){
            cnt++;
        }
    }
}
