package HackerRank;
import java.util.*;

public class ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int maxSize = Integer.MAX_VALUE;


        for (int i = 0; i < n; i++) {
            int minSize = Integer.MAX_VALUE;
            int num = in.nextInt();
            deque.addLast(num);
            if(deque.size() == m){
                for (Object o : deque) {
                    System.out.print(o);
                }
                deque.pollFirst();
            }

            System.out.println("--------------------------");
        }

    }
}