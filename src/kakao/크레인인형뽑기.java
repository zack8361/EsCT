package kakao;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 크레인인형뽑기 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board,moves));
    }

    private static int solution(int[][] board, int[] moves) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int ans = 0;

        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }


        for (int i = 0; i < moves.length; i++) {
            int ansNum = moves[i]-1;
            for (int j = 0; j < board.length; j++) {
                if(board[j][ansNum] != 0){
                    if(deque.isEmpty()){
                        deque.addLast(board[j][ansNum]);
                    }
                    else {
                        if(deque.peekLast() == board[j][ansNum]){
                            deque.pollLast();
                            ans++;
                        }
                        else {
                            deque.addLast(board[j][ansNum]);
                        }
                    }
                    board[j][ansNum] = 0;
                    break;
                }
            }
        }


        return ans*2;
    }
}
