package org.example;
import org.example.SingleSensorType.*;
import org.example.sensor.Sensor;
import org.example.sensor.TempSensor;
import org.example.sensor.impRepo;
import org.example.sensor.parametrizedRepo;

public class Main {
    public static void main(String[] args) throws InstantiationException {

//        RepositorySensorType repositorySensorType = new RepositorySensorType();
//        FactorySensorType factorySensorType = new FactorySensorType();
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

//        System.out.println("List of all sensor types previously defined and saved in repo");

//        System.out.println(sensorTypeService.getAllDefineSensorTypes());

//        Service sensorService = new Service(factorySensorType,repositorySensorType);

//        System.out.println(sensorService.getAllDefineSensorTypes());

//        Map<Type,Unit> hashMapTypeUnit = new HashMap<>();
//        hashMapTypeUnit.put(Type.Humidity,Unit.Percentage);


        SensorTypeFactory sensorTypeFactory = new SensorTypeFactory();
        SensorTypeRepository sensorTypeRepository = new SensorTypeRepository();
        SensorTypeMapper sensorTypeMapper = new SensorTypeMapper();


        SensorTypeService service = new SensorTypeService(sensorTypeRepository,sensorTypeFactory,sensorTypeMapper);
        System.out.println(service.getAllSensorTypes());


        DomainEntity domainEntity = new TempSensor();
        Sensor sensor = new TempSensor();

        impRepo impRepo = new impRepo();

        parametrizedRepo parametrizedRepo = new parametrizedRepo();

        parametrizedRepo.save((Sensor) domainEntity);

        impRepo.save((DomainEntity) sensor);











    }



}