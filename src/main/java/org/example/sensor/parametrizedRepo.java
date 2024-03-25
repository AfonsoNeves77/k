package org.example.sensor;

public class parametrizedRepo implements parametrizedRepository<Sensor>{

    @Override
    public boolean save(Sensor somethingIWish) {
        return false;
    }
}