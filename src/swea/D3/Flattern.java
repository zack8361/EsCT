package swea.D3;

import java.util.Arrays;
import java.util.Scanner;

public class Flattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++){
            int dumpCnt = sc.nextInt();
            int[] dumpArr = new int[100];

            for(int i = 0; i< dumpArr.length; i++){
                dumpArr[i] = sc.nextInt();
            }
            dumpExecute(dumpCnt,dumpArr);
            Arrays.sort(dumpArr);
            System.out.println("#" + tc +" " + (dumpArr[dumpArr.length-1] - dumpArr[0]));
        }
    }
    
    private static void dumpExecute(int dumpCnt, int[] dumpArr) {
        for(int i = 0; i<dumpCnt; i++){
            Arrays.sort(dumpArr);
            dumpArr[0]++;
            dumpArr[dumpArr.length-1]--;
        }
    }
}
