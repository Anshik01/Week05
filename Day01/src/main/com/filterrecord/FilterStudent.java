package com.filterrecord;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class FilterStudent {
    public static void main(String[] args) {
        try(CSVReader csvReader = new CSVReader(new FileReader("file.txt"))){

            String[]line;

            // reading file until null value
            while((line = csvReader.readNext()) != null){
                // filter marks
                if(Integer.parseInt(line[3]) > 80){
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
