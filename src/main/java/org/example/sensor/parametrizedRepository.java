package org.example.sensor;

public interface parametrizedRepository<T>{

    boolean save(T somethingIWish);
}
