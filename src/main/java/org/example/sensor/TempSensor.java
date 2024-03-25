package org.example.sensor;

import org.example.SingleSensorType.DomainEntity;

public class TempSensor implements Sensor, DomainEntity {
    @Override
    public void sensorInterfaceMethod() {
        System.out.println("Sensor method bip bip");
    }

    @Override
    public void someDomainEntityMethod() {
        System.out.println("DomainEntity method bip bip");
    }
}
