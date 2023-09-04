import java.util.HashSet;

public class dfsEx {
    private static HashSet<Integer> set = new HashSet<>();
    private static boolean[] visited;
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(solution(numbers));

    }

    private static int solution(int[] numbers) {
        visited = new boolean[numbers.length];
        dfs(numbers,0,0,0);
        return set.size();
    }

    private static void dfs(int[] numbers, int depth, int sum, int now) {
        if(depth == 2){
            set.add(sum);
            return;
        }
        for(int i = now; i<numbers.length; i++) {
            if(!visited[i]){
                visited[i] = true;
                dfs(numbers,depth+1,sum + numbers[i],i);
                visited[i] = false;
            }
        }
    }
}
