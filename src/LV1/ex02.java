package LV1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class ex02 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        System.out.println(solution(players,callings));
    }
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        System.out.println("hi");
        for (int i = 0; i < callings.length; i++) {
            if (Arrays.asList(players).contains(callings[i])) {
                int tempIndex = Arrays.asList(players).indexOf(callings[i]);
                String temp = players[tempIndex - 1];
                players[tempIndex - 1] = players[tempIndex];
                players[tempIndex] = temp;
            }
        }
        answer = players;
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
