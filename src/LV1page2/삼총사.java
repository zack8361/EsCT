package LV1page2;

public class 삼총사 {
    private static int cnt;
    private static boolean[] visited;
    public static void main(String[] args) {
        int[] number = {-2,3,0,2,-5};
        System.out.println(solution(number));
    }

    private static int solution(int[] number) {
        visited = new boolean[number.length];
        dfs(number,0,0,0);
        return cnt;
    }

    private static void dfs(int[] number, int depth, int sum,int now) {
        System.out.println("sum = " + sum);
        if(depth == 3){
            if(sum == 0){
                cnt++;
            }
            return;
        }
        for(int i=now; i<number.length; i++){
            if(!visited[i]) {
                visited[i] = true;
                dfs(number, depth + 1, sum + number[i],i+1);
                visited[i] = false;
            }
        }
    }
}
