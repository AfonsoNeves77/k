package org.example;

import org.example.SingleSensorType.SensorTypeFactory;

public class Main {
    public static void main(String[] args) throws InstantiationException {


        SensorTypeRepository sensorTypeRepository = new SensorTypeRepository();
        SensorTypeFactory sensorTypeFactory = new SensorTypeFactory();

        SensorTypeService sensorTypeService = new SensorTypeService(sensorTypeRepository,sensorTypeFactory);



        System.out.println(sensorTypeService.getAllSensorTypes());


    }



}