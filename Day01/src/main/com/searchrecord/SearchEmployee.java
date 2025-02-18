package com.searchrecord;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String employeeName = scanner.next();

        try(CSVReader csvReader = new CSVReader(new FileReader("file.txt"))){

            String[]line;

            // reading file until null value
            while((line = csvReader.readNext()) != null){
                // filter marks
                if(line[1].equals(employeeName)){       // line[1] has name stored in it
                    System.out.println("Department : " + line[2] + " Salary : " + line[3]);
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
