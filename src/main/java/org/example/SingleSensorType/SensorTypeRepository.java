package org.example.SingleSensorType;

import org.example.SingleSensorType.SensorType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SensorTypeRepository {

    private final Map<SensorTypeID, SensorType> sensorTypeIDSensorTypeMap = new HashMap<>();

    public boolean save(SensorType sensorType){
        sensorTypeIDSensorTypeMap.put(sensorType.getSensorTypeID(),sensorType);
        return true;
    }

    public Iterable<SensorType> findAll(){
        return sensorTypeIDSensorTypeMap.values();
    }


}
