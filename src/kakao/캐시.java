package kakao;

import java.util.ArrayDeque;

public class 캐시 {
    private static ArrayDeque<String> deque;
    public static void main(String[] args) {
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(solution(cacheSize,cities));
    }

    private static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        deque =new ArrayDeque<>();

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();
            int runTime = LRU(city,cacheSize);
            answer += runTime;
            System.out.println("answer = " + answer);
        }
        return answer;
    }

    private static int LRU(String city,int cacheSize) {
        int hit = 1;
        int miss = 5;
        while(deque.size() != cacheSize){
            deque.addLast(city);
            return miss;
        }
        if(deque.contains(city)){
            return hit;
        }
        else {
            deque.pollFirst();
            deque.addLast(city);
            return miss;
        }
    }
}
