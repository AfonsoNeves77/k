package org.example.SingleSensorType;

public interface Repository<T> {

    boolean save(T entity);

    T getByID(SensorTypeID id);

    Iterable<T> getAll();
    boolean isPresent(SensorTypeID id);
}
