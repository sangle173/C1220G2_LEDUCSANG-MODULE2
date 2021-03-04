package _12_collection_framework.practises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Sang", 29);
        hashMap.put("Kien", 20);
        hashMap.put("Cong", 35);
        hashMap.put("Huy", 30);
        System.out.println("Display entry HashMap");
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Sang", 29);
        linkedHashMap.put("Kien", 20);
        linkedHashMap.put("Cong", 35);
        linkedHashMap.put("Huy", 56);
        System.out.println("\nThe age for " + "Kha is " + linkedHashMap.get("Kha"));

    }
}
