package org.example.DDD;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ServiceSensorType {

    private FactorySensorType sensorTypeFactory;
    private RepositorySensorType sensorTypeRepository;

    private Configuration configuration;


    public ServiceSensorType(FactorySensorType factorySensorType,RepositorySensorType repositorySensorType) throws InstantiationException {

        //Validations
        this.sensorTypeFactory = factorySensorType;
        this.sensorTypeRepository = repositorySensorType;

        try {

            Configurations configurations = new Configurations();
           this.configuration = configurations.properties(new File("config.properties"));

        }catch (ConfigurationException e){
            throw new InstantiationException("Error reading config.properties");
        }

    }

    //Get a list of system permitted sensorTypes
    public List<String> getListOfAvailableSensorTypes(){

        String[] availableAsArray =  configuration.getStringArray("type");
        return List.of(availableAsArray);
    }

    //get all defined sensor types. Have to go to repo !!!!

    public List<SensorTypeAlternative> getAllDefineSensorTypes(){

        List<SensorTypeAlternative> sensorTypeList = new ArrayList<>();
        Iterable<SensorTypeAlternative> sensorTypes = sensorTypeRepository.findAll();
        sensorTypes.forEach(sensorTypeList::add);

        return sensorTypeList;
    }


    //Ask if this could be devided in to functionalityes

    public boolean defineSensorType(String chosenSensorType){
        //Some sensors might have spaces between it´s names and config.properties doesn't support spaces in it´s keys
        String trimmedChoice = chosenSensorType.replaceAll("\\s", "");

        //Need to integrate choice a get the corresponding path (check config.properties !)
        String pathToSensorType = configuration.getString(trimmedChoice);

        SensorTypeAlternative sensorTypeAlternative = sensorTypeFactory.createSensorType(pathToSensorType);

        if(sensorTypeAlternative != null){
            sensorTypeRepository.save(sensorTypeAlternative);
            return true;

        }
        return false;

    }
}
