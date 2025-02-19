package com.mergjsonobject;

import org.json.JSONObject;

public class MergeJsonTwoObjects {
    public static void main(String[] args) {
        // First JSON Object
        JSONObject json1 = new JSONObject();
        json1.put("name", "Ram");
        json1.put("age", 30);

        // Second JSON Object
        JSONObject json2 = new JSONObject();
        json2.put("city", "Bhopal");
        json2.put("country", "India");

        // Merge JSON Objects
        for(String key : json2.keySet()){
            json1.put(key, json2.get(key));
        }

        // Print merged JSON
        System.out.println(json1.toString(4)); // Pretty print with 4 spaces indentation
    }
}
