package org.example;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.example.DDD.FactorySensorType;
import org.example.DDD.RepositorySensorType;
import org.example.DDD.Service;
import org.example.DDD.ServiceSensorType;

public class Main {
    public static void main(String[] args) throws InstantiationException {

        RepositorySensorType repositorySensorType = new RepositorySensorType();
        FactorySensorType factorySensorType = new FactorySensorType();


//        ServiceSensorType sensorTypeService = new ServiceSensorType(factorySensorType,repositorySensorType);

//
//        System.out.println("List of all sensor types available in the system");
//
//        System.out.println(sensorTypeService.getListOfAvailableSensorTypes());
//
//        System.out.println("List of all sensor types previously defined and saved in repo");
//
//        System.out.println(sensorTypeService.getAllDefineSensorTypes());
//
//        System.out.println("Result of addition request");
//
//        System.out.println(sensorTypeService.defineSensorType("Temperature"));
//        System.out.println(sensorTypeService.defineSensorType("Humidi ty"));
//
//        System.out.println("List of all sensor types previously defined and saved in repo");
//
//        System.out.println(sensorTypeService.getAllDefineSensorTypes());


        Service sensorService = new Service(factorySensorType,repositorySensorType);

        System.out.println(sensorService.getAllDefineSensorTypes());








    }



}