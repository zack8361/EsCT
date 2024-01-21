package theBeum;

public class 덧칠하기 {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        int[] section = {1,2,4,5};
        System.out.println(solution(n,m,section));
    }

    private static int solution(int n, int m, int[] section){
        int answer = 0;

        int start = section[0];

        for (int paint : section) {
            if(start + m > paint){
                continue;
            }
            start = paint;
            answer++;
        }

        return answer;
    }
}
