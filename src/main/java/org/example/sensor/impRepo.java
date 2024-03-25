package org.example.sensor;

import org.example.SingleSensorType.DomainEntity;

public class impRepo implements Repository {
    @Override
    public boolean save(DomainEntity domain) {
        return false;
    }
}
