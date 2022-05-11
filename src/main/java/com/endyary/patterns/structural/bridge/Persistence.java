package com.endyary.patterns.structural.bridge;

public interface Persistence {
    Object create(Object object);

    Object read(Object object);

    Object update(Object object);

    void delete(Object object);
}
