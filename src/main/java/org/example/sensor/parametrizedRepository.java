package org.example.sensor;

import org.example.SingleSensorType.DomainEntity;

public interface parametrizedRepository<T>{

    boolean save(T somethingIWish);

    boolean isPresent(DomainEntity DE);
}
