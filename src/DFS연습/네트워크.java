package DFS연습;

public class 네트워크 {
    private static int[][] computer;
    private static int cnt;
    private static boolean[] visited;
    public static void main(String[] args) {
        int n = 3;
        int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solution(n,computers));
    }

    private static int solution(int n, int[][] computers) {

        computer = computers;
        visited = new boolean[computers[0].length];

        for (int i = 0; i < computers.length; i++) {
            if(!visited[i]){
                dfs(i);
                cnt++;
            }
        }
        return cnt;
    }

    private static void dfs(int now) {
        visited[now] = true;
        for (int i = 0; i < computer.length; i++) {
            if(!visited[i] && computer[now][i] == 1){
                dfs(i);
            }
        }
    }
}
