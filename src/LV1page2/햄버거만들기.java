package LV1page2;

import java.util.Stack;

public class 햄버거만들기 {
    public static void main(String[] args) {
        int[] ingredient = {2,1,1,2,3,1,2,3,1};
        System.out.println(solution(ingredient));
    }


//    1,2,3,1
    private static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<ingredient.length; i++){
            stack.push(ingredient[i]);
            String ans = "";

            if(stack.size() >= 4){
                int a = stack.get(stack.size()-4);
                int b = stack.get(stack.size()-3);
                int c = stack.get(stack.size()-2);
                int d = stack.get(stack.size()-1);
                ans += String.valueOf(a) + String.valueOf(b) +String.valueOf(c) +String.valueOf(d);
            }

            if(ans.equals("1231")){
                answer++;
                for (int j = 0; j < 4; j++) {
                    stack.pop();
                }
            }
        }
        return answer;
    }
}
