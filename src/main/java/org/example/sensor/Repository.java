package org.example.sensor;

import org.example.SingleSensorType.DomainEntity;

public interface Repository {

    boolean save(DomainEntity domain);
}
