package org.example.SingleSensorType;

import org.example.Unit;

public class UnitVO {

    private Unit unit;


    //Illegal Argument
    public UnitVO(String unit){
        this.unit = Unit.valueOf(unit);
    }

    @Override
    public String toString() {
        return  unit.toString();
    }
}
