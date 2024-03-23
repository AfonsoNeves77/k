package org.example.DDD;

import org.example.Type;
import org.example.Unit;

public class TemperatureType implements SensorTypeAlternative {

    private SensorTypeID sensorTypeID;
    private UnitVO unit;

    public TemperatureType(){
        sensorTypeID = new SensorTypeID(Type.Temperature);
        unit = new UnitVO(Unit.Celsius);
    }

    public SensorTypeID getType(){
        return this.sensorTypeID;
    }

    public UnitVO getUnit(){
        return this.unit;
    }

    @Override
    public String toString() {
        return "TemperatureType{" +
                "sensorTypeID=" + sensorTypeID +
                ", unit=" + unit +
                '}';
    }
}
