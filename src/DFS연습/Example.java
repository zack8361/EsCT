package DFS연습;

public class Example {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        dfs(arr,0,0,0);
    }

    private static void dfs(int[] arr, int sum, int cnt,int now) {

        if(cnt == 2){
            System.out.println("sum = " + sum);
            return;
        }

        for (int i = now; i < arr.length; i++) {
            dfs(arr,sum + arr[i],cnt+1,i+1);
        }
    }
}
