package lesson_4_set_map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Task2 {
    public void task2(String sentence){
        HashMap<Integer, String> myHashMap = new HashMap<>();
        for (int i = 0; i< sentence.length(); i++ ) {
            myHashMap.put(i, sentence.substring(i, i+1));
        }

        LinkedHashMap <String, Integer> tempHashMap = new LinkedHashMap<>();
        for (String i:myHashMap.values()) {
            if(tempHashMap.keySet().contains(i)){
                tempHashMap.put(i, tempHashMap.get(i)+1 );
            } else {
                tempHashMap.put(i, 1);
            }
        }
        System.out.println(tempHashMap);
    }
}
