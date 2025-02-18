package com.writecsvfile;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInCSVFile {
    public static void main(String[] args) {
        try(CSVWriter csvWriter = new CSVWriter(new FileWriter("file.txt"))){
            // header is inserted
            String[]header = {"ID", "Name", "Department", "Salary"};
            // records
            String[]record1 = {"101", "Anshik", "CSE-AIML", "50000"};
            String[]record2 = {"102", "Aayush", "CSE", "40000"};
            String[]record3 = {"103", "Ansh", "CSE", "60000"};
            String[]record4 = {"104", "Durgesh", "CSE-AIML", "30000"};
            String[]record5 = {"105", "Varsha", "CSE-AIML", "80000"};

            // writing all the rows in sequence
            csvWriter.writeNext(header);
            csvWriter.writeNext(record1);
            csvWriter.writeNext(record2);
            csvWriter.writeNext(record3);
            csvWriter.writeNext(record4);
            csvWriter.writeNext(record5);

            System.out.println("Records has been added successFully to CSV file");
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
