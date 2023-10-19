package kakao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class 개인정보수집유호기간 {
    public static void main(String[] args) throws ParseException {
        String today = "2022.05.19;";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(solution(today,terms,privacies));
    }

    private static int[] solution(String today, String[] terms, String[] privacies) throws ParseException {

        HashMap<String,Integer> dateMap = new HashMap<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        for (int i = 0; i < terms.length; i++) {
            String[] str = terms[i].split(" ");
            dateMap.put(str[0],Integer.parseInt(str[1]));
        }

        int i = 0;
        int a = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(String st : privacies){
            String[] str = st.split(" ");
            Date date = dateFormat.parse(str[0]);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);

            int nowMonth = dateMap.get(str[1]);
            calendar.add(Calendar.MONTH,nowMonth);

//          배열에서 뽑은 날짜 데이터
            Date newDate = calendar.getTime();

//          today 를 date 객체로 전환();
            Date todayDate = dateFormat.parse(today);

            if(newDate.before(todayDate) || newDate.equals(todayDate)){
                list.add(i+1);
            }

            i++;
        }

        int[] answer = new int[list.size()];

        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }

        return answer;
    }
}
