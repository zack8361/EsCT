package BOJ.Silver3;

import java.util.HashMap;
import java.util.HashSet;

public class 셀프넘버 {
    public static void main(String[] args) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int i = 1; i < 10000; i++) {
            numSet.add(i);
        }
        System.out.println("numSet = " + numSet);



        for (int i = 1; i < 10000; i++) {
            String num = String.valueOf(i);
            int realNum = i;
            int sum = 0;
            for (int j = 0; j < num.length(); j++) {
                 sum += Integer.parseInt(String.valueOf(num.charAt(j)));
            }
            realNum += sum;
            if(numSet.contains(realNum)){
                numSet.remove(realNum);
            }
        }

        for (int integer : numSet) {
            System.out.println( integer);
        }

    }
}
