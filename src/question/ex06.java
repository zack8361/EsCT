package question;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 20;
        int myAnswer = sc.nextInt();

//        빈 문자열 하나 생성.
        String response = "";

//        만약 정답이랑 내가 입력한 변수랑 같다면?
        if(answer == myAnswer){
            response = "정답입니다";
        }
        else {
            response = "오답입니다!";
        }

//        위에 분기를 태워서 response 라는 문자열에 할당되었겠찌 어떤것이 ? 그거 출력해ㅓㅅ 확인
        System.out.println(response);
    }
}
