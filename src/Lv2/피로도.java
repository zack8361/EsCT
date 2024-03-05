package Lv2;

public class 피로도 {
    private static boolean[] visited;
    private static int[][] map;

    private static int cntx;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        System.out.println(solution(k,dungeons));
    }

    private static int solution(int k, int[][] dungeons) {
        int answer = 0;
        visited = new boolean[dungeons.length];
        map = dungeons;


        for (int i = 0; i < dungeons.length; i++) {
            dfs(i,0,k);
        }

        return cntx;
    }

    private static void dfs(int now, int cnt, int k) {
        cntx = Math.max(cntx,cnt);
        for (int i = 0; i < map.length; i++) {
            if(!visited[i] && map[i][0] <=k){
                visited[i] = true;
                dfs(i,cnt+1,k-map[i][1]);
                visited[i] = false;
            }
        }
    }
}
