package LV1;

public class 하샤드수 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(solution(x));
    }

    private static boolean solution(int x) {
        String s = String.valueOf(x);

        int num = 0;
        for(int i=0; i<s.length(); i++){
            num += Integer.valueOf(String.valueOf(s.charAt(i)));
        }
        if(x%num == 0){
            return true;
        }
        return false;
    }
}
