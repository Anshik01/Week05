package com.readandcount;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReadAndCountRows {
    public static void main(String[] args) {
        try(CSVReader csvReader = new CSVReader(new FileReader("file.txt"))){

            String[]line;
            // count variable will count number of rows
            int count = 0;

            // reading file until null value
            while((line = csvReader.readNext()) != null){
                System.out.println("ID : " + line[0] + " Name : " + line[1] + " Department : " + line[2] + " Salary : " + line[3]);
                count++;
            }

            System.out.println("Total number of rows : " + count);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}
