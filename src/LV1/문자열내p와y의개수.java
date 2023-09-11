package LV1;



public class 문자열내p와y의개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(solution(s));
    }

    private static boolean solution(String s) {
        boolean answer = false;
        String str = s.toUpperCase();
        int pN = 0;
        int yN = 0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == 'P'){
                pN++;
            }
            else if(str.charAt(i) == 'Y'){
                yN++;
            }
        }
        if(pN == yN){
            return true;
        }
        return answer;
    }
}
