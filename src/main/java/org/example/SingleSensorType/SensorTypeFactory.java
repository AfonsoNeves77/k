package org.example.SingleSensorType;

import org.example.SensorTypeID;
import org.example.SingleSensorType.SensorType;
import org.example.UnitVO;

public class SensorTypeFactory {

    public SensorType createSensorType(SensorTypeID sensorTypeID, UnitVO unitVO){
        return new SensorType(sensorTypeID,unitVO);
    }
}
