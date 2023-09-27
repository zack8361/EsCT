package kakao;

public class 비밀지도 {
    public static void main(String[] args) {
        int n =5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        System.out.println(solution(n,arr1,arr2));
    }

    private static String[] solution(int n,int[] arr1, int[] arr2) {

        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String str1 = Integer.toString(arr1[i],2);
            String str2 = Integer.toString(arr2[i],2);
            while (str1.length() !=n ){
                str1 = "0" + str1;
            }
            while (str2.length() != n){
                str2 = "0" + str2;
            }
            String ans = "";
            for (int j = 0; j < n; j++) {
                if(str1.charAt(j) != str2.charAt(j)){
                    ans += "#";
                }
                else if(str1.charAt(j) == '0' && str2.charAt(j) == '0'){
                    ans += " ";
                }
                else if(str1.charAt(j) == '1' && str2.charAt(j) == '1'){
                    ans +="#";
                }
            }
            answer[i] = ans;
        }

        return answer;
    }
}
