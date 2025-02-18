package com.sortrecords;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class SortSalary {
    static class Employee implements Comparable<Employee>{
        int id;
        String name;
        String department;
        int salary;

        Employee(int id, String name, String department, int salary){
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        // specifying on the that we should sort the arrayList based on salary
        @Override
        public int compareTo(Employee o) {
            return Integer.compare(this.salary, o.salary);
        }
    }

    public static void main(String[] args) {
        try(CSVReader csvReader = new CSVReader(new FileReader("file.txt"))){
            ArrayList<Employee> listOfEmployee = new ArrayList<>();

            String[]line;
            while((line = csvReader.readNext()) != null){
                // parsing string to integer
                int id = Integer.parseInt(line[0]);
                String name = line[1];
                String department = line[2];
                int salary = Integer.parseInt(line[3]);
                Employee employee = new Employee(id, name, department, salary);
                // adding data of all the employee in the list
                listOfEmployee.add(employee);
            }

            // sorting the list in descending order based on salary
            listOfEmployee.sort(Collections.reverseOrder());

            for (Employee em : listOfEmployee) {
                System.out.println("ID : " + em.id + ", Name : " + em.name + ", Department : " + em.department + ", Salary " + em.salary);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
