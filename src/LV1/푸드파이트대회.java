package LV1;

public class 푸드파이트대회 {
    public static void main(String[] args) {
        int[] food = {1,3,4,6};
        System.out.println(solution(food));
    }

    private static String solution(int[] food) {
        String answer = "";
        String water = "0";
        String firstPlayer = "";
        String secondPlayer = "";
        for(int i = 1; i<food.length; i++){
            if(food[i] <= 1) {
                continue;
            }
            int cnt = food[i] / 2;
            for (int j = 0; j < cnt; j++) {
                firstPlayer += String.valueOf(i);
                secondPlayer = String.valueOf(i) + secondPlayer;
            }
        }

        answer = firstPlayer + water + secondPlayer;
        return answer;
    }
}
