package question;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 상품명 입력.
        System.out.print("상품명 : ");
        String objName = sc.next();
        // 상품 갯수.
        System.out.print("수량 : ");
        int objCount = sc.nextInt();
        // 단가
        System.out.print("단가 : ");
        int objPrice  = sc.nextInt();

        // objCalculate 함수 호출 과 동시에 출력.
        System.out.println(objCalculate(objName,objCount,objPrice));
    }


    // objCalculate 함수 / returnType = int(정수) 값을 계산하니까 / ParameterType = 위에 내가 선언한 3개.
    private static int objCalculate(String objName, int objCount, int objPrice) {

    //수량이 5개 이상인 경우
        if(objCount >=5){
            System.out.println("상품 : " + objName);
            System.out.println("총금액 : " + objCount * objPrice);
            System.out.println("5개 이상 10프로 할인된 금액 : "  + objCount * objPrice * 0.9);
        }
    //수량이 5개 이상의 반대말 5개 미만인 경우.
        else {
            System.out.println("상품 : " + objName);
            System.out.println("총금액 : " + objCount * objPrice);
        }
        return 0;
    }
}
