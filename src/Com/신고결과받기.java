package Com;

import java.util.HashMap;

public class 신고결과받기
{
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        System.out.println(solution(id_list,report,k));
    }

    private static int[] solution(String[] idList, String[] report, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,String> map2 = new HashMap<>();;

        return new int[0];
    }
}
