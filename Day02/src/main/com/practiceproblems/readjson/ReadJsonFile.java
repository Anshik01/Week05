package com.practiceproblems.readjson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

class Student{
    private String name;
    private String email;
    private int marks;

    public Student() {}

    public Student(String name, String type, int price){
        this.name = name;
        this.email = type;
        this.marks = price;
    }

    // getter methods to access private fields
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getMarks(){
        return marks;
    }
}

public class ReadJsonFile {
    public static void main(String[] args) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();

            // reading json file using object mapper
            Student student = objectMapper.readValue(new File("data.json"), Student.class);

            // extracting only required field
            System.out.println("Name : " + student.getName());
            System.out.println("Email : " + student.getEmail());

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
