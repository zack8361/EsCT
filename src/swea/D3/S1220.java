package swea.D3;

import java.util.Arrays;
import java.util.Scanner;

public class S1220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int tc = 1; tc <= 10; tc++){
            int N = sc.nextInt();
            int[][] map = new int[N][N];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    map[i][j] = sc.nextInt();
                }
            }
            int ans = 0;
            for(int i = 0; i<map.length; i++){
                for (int j = 0; j < map.length; j++) {
                    if(map[i][j] == 0) {
                        continue;
                    }
                    else if(map[i][j] == 1){
                        if (i + 1 == map.length) break;
                        if(map[i+1][j] == 2){
                            ans++;
                        }
                        else {
                            map[i+1][j] = map[i][j];
                        }
                    }
                }
            }
            System.out.println(ans);
            for (int i = 0; i < map.length; i++) {
                System.out.println(Arrays.toString(map[i]));
            }
        }
    }
}