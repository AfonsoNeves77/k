package org.example.DDD;


import java.util.HashMap;
import java.util.Map;

public class RepositorySensorType {

    private final Map<SensorTypeID, SensorTypeAlternative> sensorTypeIDSensorTypeMap = new HashMap<>();

    public boolean save(SensorTypeAlternative sensorType){
        sensorTypeIDSensorTypeMap.put(sensorType.getType(),sensorType);
        return true;
    }


    public Iterable<SensorTypeAlternative> findAll(){
        return sensorTypeIDSensorTypeMap.values();
    }
}
