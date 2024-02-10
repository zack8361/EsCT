package DFS연습;

import java.util.Arrays;

public class Example2 {
    private static String[] str;
    public static void main(String[] args) {
        str = new String[]{"A", "B", "C", "D", "E", "F", "G"};

        for(int i = 0; i<str.length; i++){
            for (int j = i; j < str.length; j++) {
                for(int k = i; k<=j; k++){
                    System.out.print(str[k]);
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
