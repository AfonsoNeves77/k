package org.example.DDD;

import org.example.Type;
import org.example.Unit;

public class HumidityType implements SensorTypeAlternative {

    private SensorTypeID sensorTypeID;
    private UnitVO unit;

    public HumidityType(){
        sensorTypeID = new SensorTypeID(Type.Humidity);
        unit = new UnitVO(Unit.Percentage);
    }

    @Override
    public UnitVO getUnit() {
        return this.unit;
    }

    public SensorTypeID getType(){
        return this.sensorTypeID;
    }


    @Override
    public String toString() {
        return "HumidityType{" +
                "sensorTypeID=" + sensorTypeID +
                ", unit=" + unit +
                '}';
    }
}
