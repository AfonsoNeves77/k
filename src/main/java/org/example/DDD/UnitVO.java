package org.example.DDD;

import org.example.Unit;

public class UnitVO {

    private final Unit unit;

    public UnitVO(Unit unit){
        this.unit = unit;
    }

    @Override
    public String toString() {
        return  unit.toString();
    }
}
