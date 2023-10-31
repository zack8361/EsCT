package BOJ.Silver5;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;

public class 그룹단어체커
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < num; i++) {
            ArrayDeque<String> deque = new ArrayDeque<>();
            HashSet<String> wordSet = new HashSet<>();
//            단어 한개 입력
            String word = scanner.next();
            boolean flag = false;
//           차근 차근 queue 에 쌓기
            for (int j = 0; j < word.length(); j++) {
                if(!wordSet.contains(String.valueOf(word.charAt(j)))){
                    wordSet.add(String.valueOf(word.charAt(j)));
                }
                else {
                    if(word.charAt(j) == word.charAt(j-1)){
                        wordSet.add(String.valueOf(word.charAt(j)));
                    }
                    else {
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
