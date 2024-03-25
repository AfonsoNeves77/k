package org.example.SingleSensorType;

public class SensorTypeMapper {

    public SensorTypeMapper(){

    }

    public SensorTypeID createSensorTypeID(String type){
        return new SensorTypeID((type));
    }

    public UnitVO createUnitVO(String unit){
        return new UnitVO((unit));
    }
}
