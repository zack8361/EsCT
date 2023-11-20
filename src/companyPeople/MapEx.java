package companyPeople;

import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<Integer,HashMap<String,Integer>> map =new HashMap<>();
        System.out.println("map = " + map);


        HashMap<String,Integer> innerMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            innerMap.put("key1",i);

        }

    }
}
