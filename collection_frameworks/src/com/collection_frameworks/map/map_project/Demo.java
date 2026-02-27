package com.collection_frameworks.map.map_project;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,3,3,4};
        Map<Integer,Integer> map = new HashMap<>();


        for (int num : arr){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        // printing result
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " ------> " + entry.getValue());
        }
    }
}
