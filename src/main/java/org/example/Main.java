package org.example;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.plist.PropertyListConfiguration;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InstantiationException {


        SensorTypeRepository sensorTypeRepository = new SensorTypeRepository();
        SensorTypeFactory sensorTypeFactory = new SensorTypeFactory();

        SensorTypeService sensorTypeService = new SensorTypeService(sensorTypeRepository,sensorTypeFactory);



        System.out.println(sensorTypeService.getAllSensorTypes());


    }



}