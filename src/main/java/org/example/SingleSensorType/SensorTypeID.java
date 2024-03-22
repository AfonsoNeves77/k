package org.example.SingleSensorType;

public class SensorTypeID {

    private Type sensorTypeID;


    //Illegal Argument
    public SensorTypeID(String sensorTypeID){
        this.sensorTypeID = Type.valueOf(sensorTypeID);
    }

    @Override
    public String toString() {
        return  sensorTypeID.toString();
    }
}
