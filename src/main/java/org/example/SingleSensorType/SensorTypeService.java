package org.example.SingleSensorType;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SensorTypeService {

    private SensorTypeFactory sensorTypeFactory;
    private SensorTypeRepository sensorTypeRepository;

    private SensorTypeMapper sensorTypeMapper;

    //Inject Mapper

    public SensorTypeService(SensorTypeRepository sensorTypeRepository,SensorTypeFactory sensorTypeFactory,SensorTypeMapper sensorTypeMapper) throws InstantiationException {
        this.sensorTypeFactory = sensorTypeFactory;
        this.sensorTypeRepository = sensorTypeRepository;
        this.sensorTypeMapper = sensorTypeMapper;

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

            //This step breaks down a configuration line that is like this "Humidity|Percentage" to [Humidity,Percentage]

            String[] separateConfig = separateConfigurations(s);

            SensorTypeID sensorTypeID = sensorTypeMapper.createSensorTypeID(separateConfig[0]);
            UnitVO unit = sensorTypeMapper.createUnitVO(separateConfig[1]);

            SensorType sensorType = sensorTypeFactory.createSensorType(sensorTypeID, unit);

            sensorTypeRepository.save(sensorType);
        }
    }

    private String[] separateConfigurations(String configuration){

        return configuration.split("\\|");
    }

    private List<String> sensorTypeReadingAndConversion() throws ConfigurationException {
        Configurations configs = new Configurations();
        Configuration configuration = configs.properties(new File("config.properties"));

        String[] unitTypeConfigurations = configuration.getStringArray("type");
        return List.of(unitTypeConfigurations);

    }
    public List<SensorType> getAllSensorTypes(){
        List<SensorType> sensorTypeList = new ArrayList<>();

        Iterable<SensorType> sensorTypes = sensorTypeRepository.findAll();

        sensorTypes.forEach(sensorTypeList::add);

        return sensorTypeList;
    }

}
