package org.example.sensor;

import org.example.SingleSensorType.DomainEntity;

public class parametrizedRepo implements parametrizedRepository<Sensor>{

    @Override
    public boolean save(Sensor somethingIWish) {
        return false;
    }

    @Override
    public boolean isPresent(DomainEntity DE) {
        return false;
    }
}