package com.convertobjecttojson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
    private String model;
    private String type;
    private int price;

    public Car() {}

    public Car(String model, String type, int price){
        this.model = model;
        this.type = type;
        this.price = price;
    }

    // getter methods to access private fields
    public String getModel(){
        return model;
    }
    public String getType(){
        return type;
    }
    public int getPrice(){
        return price;
    }
}

public class ConvertJavaObjectToJson {
    public static void main(String[] args) {
        try{
            // using objectMapper to convert java object to json
            ObjectMapper objectMapper = new ObjectMapper();

            // initializing an object
            Car car = new Car("Audi", "Petrol", 200000);

            // converting to json
            String jsonString = objectMapper.writeValueAsString(car);

            System.out.println(jsonString);
        }

        catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
