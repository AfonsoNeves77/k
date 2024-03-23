package org.example.DDD;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Service {


    private FactorySensorType sensorTypeFactory;
    private RepositorySensorType sensorTypeRepository;

    public Service(FactorySensorType factorySensorType,RepositorySensorType repositorySensorType) throws InstantiationException {

        //Validations
        this.sensorTypeFactory = factorySensorType;
        this.sensorTypeRepository = repositorySensorType;

        try {
            populateSensorTypeRepository();
        }
        catch (ConfigurationException configurationException){
            throw new InstantiationException("Invalid config.properties reading");
        }


    }

    private void populateSensorTypeRepository() throws ConfigurationException {

        List<String> listOf = sensorTypeReadingAndConversion();

        for (String s : listOf) {
            SensorTypeAlternative sensorType = sensorTypeFactory.createSensorType(s);
            sensorTypeRepository.save(sensorType);
        }
    }

    private List<String> sensorTypeReadingAndConversion() throws ConfigurationException {
        Configurations configs = new Configurations();
        Configuration configuration = configs.properties(new File("config.properties"));

        String[] unitTypeConfigurations = configuration.getStringArray("sensorType");
        return List.of(unitTypeConfigurations);
    }


    public List<SensorTypeAlternative> getAllDefineSensorTypes(){

        List<SensorTypeAlternative> sensorTypeList = new ArrayList<>();
        Iterable<SensorTypeAlternative> sensorTypes = sensorTypeRepository.findAll();
        sensorTypes.forEach(sensorTypeList::add);

        return sensorTypeList;
    }
}
