package LV1;

import java.util.HashMap;
import java.util.Objects;

public class ex02 {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("success","200");
        map.put("fail" , "500");
        for (String s : map.keySet()) {
            System.out.println(s);
        }
        
        int[] arr =new int[3];

    }
}
