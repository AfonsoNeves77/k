package org.example.SingleSensorType;

import java.util.HashMap;
import java.util.Map;

public class SensorTypeRepository implements Repository<SensorType> {

    private final Map<SensorTypeID, SensorType> sensorTypeIDSensorTypeMap = new HashMap<>();

    public boolean save(SensorType sensorType){
        sensorTypeIDSensorTypeMap.put(sensorType.getSensorTypeID(),sensorType);
        return true;
    }

    @Override
    public SensorType getByID(SensorTypeID id) {
        return null;
    }

    @Override
    public Iterable<SensorType> getAll() {
        return null;
    }

    @Override
    public boolean isPresent(SensorTypeID id) {
        return false;
    }

    public Iterable<SensorType> findAll(){
        return sensorTypeIDSensorTypeMap.values();
    }



}
