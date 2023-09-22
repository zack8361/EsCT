package Com;

import java.util.ArrayDeque;
import java.util.Stack;

public class 햄버거만들기 {

    private static int cnt;
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        System.out.println(solution(ingredient));
    }

//    1 : 빵
//    2 : 야채
//    3 : 고기
//    1 - 2 - 3 - 1

    private static int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();

        String answer = "1231";
        for (int i = 0; i < ingredient.length; i++) {
            stack.push(ingredient[i]);
            String ans = "";
            if(stack.size()>=4){
                ans += String.valueOf(stack.get(i-3)) + String.valueOf(stack.get(i-2)) + String.valueOf(stack.get(i-1)) + String.valueOf(stack.get(i));
            }
            if(ans.equals(answer)){
                stack.pop();
                stack.pop();
                stack.pop();
                stack.pop();
                cnt++;
            }
            System.out.println("ingredient = " + ingredient[i]);
            System.out.println("stack = " + stack);
            System.out.println("ans = " + ans);
        }
        return cnt;
    }
}
