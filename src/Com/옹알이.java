package Com;

import java.util.ArrayList;
import java.util.Arrays;

public class 옹알이 {
    public static void main(String[] args) {
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(solution(babbling));
    }

    private static int solution(String[] babbling) {
        int answer = 0;
        // 가능한 발음 "aya", "ye", "woo", "ma"
        ArrayList<String> talk = new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma"));
        for (String _babbling : babbling) {
            if (talk.toString().contains(_babbling)) {
                //혼자로도 발음 가능
                answer++;
            } else {
                //조합되어 만들어질 수 있는 지 확인
                answer += Search(_babbling, talk); // ** 여기서 +1이 안되는...
            }
            talk = new ArrayList<>(Arrays.asList("aya", "ye", "woo", "ma")); //Search 함수에서 조합할 때 중복을 피하기 위해 제거 하므로 다시 선언
        }
        System.out.println(answer + " // ");
        return answer;
    }

    public static int Search(String _babbling, ArrayList<String> talk) {
        //조합 가능한지 검색
        int count = 0;
        for (String _talk : talk) {
            System.out.println("count = " + count);
            if (_babbling.contains(_talk)) {
                talk.remove(_talk);
                _babbling = _babbling.replaceFirst(_talk, "");
                System.out.println("Search : " +_babbling+" //"+_babbling.isEmpty()+" // "+talk);
                // **  println에서 _babbling.isEmpty() 분명 true 잘 나오고 return에서 count 1로 나오는데
                if (_babbling.isEmpty()) count=1;
                if(!_babbling.isEmpty()) count = Search(_babbling, talk);
                return count;
            }
        }
        return count;
    }
}
