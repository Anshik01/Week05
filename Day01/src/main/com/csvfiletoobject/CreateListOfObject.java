package com.csvfiletoobject;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CreateListOfObject {
    // student class
    static class Student{
        int id;
        String name;
        String department;
        int marks;

        Student(int id, String name, String department, int marks){
            this.id = id;
            this.name = name;
            this.department = department;
            this.marks = marks;
        }

    }

    public static void main(String[] args) {
        // list to store student data
        List<Student> listOfStudent = new ArrayList<>();

        try(CSVReader csvReader = new CSVReader(new FileReader("file"))){
            String[]line;
            while((line = csvReader.readNext()) != null){
                // parsing data
                int id = Integer.parseInt(line[0]);
                String name = line[1];
                String department = line[2];
                int marks = Integer.parseInt(line[3]);
                Student student = new Student(id, name, department, marks);

                listOfStudent.add(student);
            }

            for (Student student : listOfStudent) {
                System.out.println("ID : " + student.id + ", Name : " + student.name + ", Department : " + student.department + ", Marks " + student.marks);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
