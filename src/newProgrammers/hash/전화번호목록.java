package newProgrammers.hash;


import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 고득점 KIT(Hash) - 전화번호목록(Lv2)
 */
public class 전화번호목록 {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(solution(phone_book));
    }

    private static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);


        for(int i = 0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }

        return true;
    }
}
