package org.example.SingleSensorType;


public class SensorTypeFactory {

    public SensorType createSensorType(SensorTypeID sensorTypeID, UnitVO unitVO){
        return new SensorType(sensorTypeID,unitVO);
    }
}
