package LV1page2;

public class 삼진법뒤집어제끼기 {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;
        String thirdNum = (Integer.toString(n,3));
        String midNum = "";

        for (int i = thirdNum.length()-1; i >= 0; i--) {
            midNum+=thirdNum.charAt(i);
        }
        return  Integer.parseInt(midNum,3);
    }
}
