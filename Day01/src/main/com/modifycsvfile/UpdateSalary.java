package com.modifycsvfile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class UpdateSalary {
    public static void main(String[] args) {
        try(CSVReader csvReader = new CSVReader(new FileReader("file.txt"))){

            String[]line;

            // reading file until null value
            while((line = csvReader.readNext()) != null){
                // filter employee by department
                if(line[2].equals("IT")){       // line[2] has department stored in it
                    int salary = Integer.parseInt(line[3]);
                    // increasing salary by 10%
                    salary += (salary/10);
                    // updating salary
                    line[3] = String.valueOf(salary);

                    System.out.println("ID : " + line[0] + " Name : " + line[1] + " Department : " + line[2] + " Salary : " + line[3]);
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
