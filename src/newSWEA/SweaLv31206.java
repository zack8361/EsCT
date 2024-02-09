package newSWEA;


import java.util.Scanner;

public class SweaLv31206 {

    private static int[] arr;
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i =2; i<arr.length-2; i++){
            answer+=isView(i);
        }
        System.out.println(answer);


    }

    /**
     * 빌딩 idx 좌우 2 까지 max 도출
     * 현재 빌딩 > max 이면 조망권 확보 현재빌딩 < max 조망권 확보 실패
     * 확보 된다면 building - max (조망권 확보 수)
     */
    private static int isView(int buildingIdx){
        int building = arr[buildingIdx];
        int max = Math.max(arr[buildingIdx-2],Math.max(arr[buildingIdx-1],Math.max(arr[buildingIdx+1], arr[buildingIdx+2])));
        return (building > max) ? building-max : 0;
    }
}
