package com.practiceproblems.jsonobject;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJasonObject {
    public static void main(String[] args) {
        // creating JSONArray to store subjects
        JSONArray subjects = new JSONArray();

        subjects.put("Physics");
        subjects.put("Chemistry");
        subjects.put("Math");

        JSONObject student = new JSONObject();

        // JSONObject store name, age and subject array
        student.put("Name", "Anshik Jaiswal");
        student.put("Age", 20);
        student.put("Subjects", subjects);


        System.out.println("Student data: ");
        System.out.println(student);
    }
}
