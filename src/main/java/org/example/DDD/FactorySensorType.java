package org.example.DDD;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class FactorySensorType {

    //Este paramtro é passado depois de ter sido feita a escolha do tipo de sensor (lista do configs e de se ter obtido o path)

    public SensorTypeAlternative createSensorType(String sensorTypePath){

        try{
            Class<?> classObj = Class.forName(sensorTypePath);
            Constructor<?> constructor = classObj.getDeclaredConstructor();
            SensorTypeAlternative sensorType = (SensorTypeAlternative) constructor.newInstance();
            return sensorType;

        }catch (ClassNotFoundException | NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e){
           return null;
        }

    }

    private String removeEmptySpaces(String sensorTypeID){
        return sensorTypeID.replaceAll("\\s", "");
    }
}
