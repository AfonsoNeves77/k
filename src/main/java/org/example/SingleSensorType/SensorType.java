package org.example.SingleSensorType;

import org.example.SingleSensorType.SensorTypeID;
import org.example.SingleSensorType.UnitVO;

public class SensorType {

    private SensorTypeID sensorTypeID;
    private UnitVO Unit;


    //ValidateNUll!!!

    public SensorType(SensorTypeID sensorTypeID, UnitVO unit){
        this.sensorTypeID = sensorTypeID;
        this.Unit = unit;
    }

    public SensorTypeID getSensorTypeID() {
        return sensorTypeID;
    }

    @Override
    public String toString() {
        return
                "sensorTypeID=" + sensorTypeID +
                ", Unit=" + Unit;
    }
}
