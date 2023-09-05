package question;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
//        정답을 미리 10으로 지정
        int answerNum = 10;
        
//        여기는 내가 임의로 변수 하나 입력
        int myNum = sc.nextInt();

//        String response 라는 문자열 하나 생성 -> 안의 내용을 3항연산자로 할당
//        만약 정답이랑 내가 현재 입력한 변수랑 같으면 ? response 라는 문자열에 정답입니다 할당 / 다르면 ? 오답입니다 할당.
        String response = (answerNum == myNum) ? "정답입니다" : "오답입니다!";

//        출력
        System.out.println(response);


    }
}
