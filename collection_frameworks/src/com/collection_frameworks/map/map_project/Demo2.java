package com.collection_frameworks.map.map_project;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
    public static void main(String[] args) {
        Map<String, String> emails = new HashMap<>();
        emails.put("abc@gmail.com", "abc123");
        emails.put("def@gmail.com", "def123");
        emails.put("uvw@gmail.com", "uvw123");
        emails.put("xyz@gmail.com", "xyz123");


        // print operation
        System.out.println(emails);

        // read operation
        for (Map.Entry<String, String> entry : emails.entrySet()) {
            String key = entry.getKey();
            String values = entry.getValue();
            System.out.println(key + " --> " + values);
        }


    }
}
