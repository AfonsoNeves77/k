package org.example.DDD;

import org.example.Type;

public class SensorTypeID {

    Type type;

    public SensorTypeID(Type enumType){
        this.type = enumType;
    }

    @Override
    public String toString() {
        return type.toString();
    }
}