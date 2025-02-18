package com.readandprintcsvfile;

import com.opencsv.CSVReader;

import java.io.FileReader;

public class ReadAndPrintCsvFile {
    public static void main(String[] args) {
        // using CSVReader to read csv file
        try(CSVReader csvReader = new CSVReader(new FileReader("file.txt"))){
            String[] line;
            while((line = csvReader.readNext()) != null){
                // print csvFile data
                System.out.println("Id: " + line[0] + " Name : " + line[1] + " Age : " + line[2] + " Marks : " + line[3]);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
