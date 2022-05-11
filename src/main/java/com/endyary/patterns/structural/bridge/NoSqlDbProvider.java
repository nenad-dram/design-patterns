package com.endyary.patterns.structural.bridge;

public class NoSqlDbProvider implements Persistence {
    @Override
    public Object create(Object object) {
        System.out.println("Create " + object.getClass().getSimpleName() + " in a NoSQL DB");
        return object;
    }

    @Override
    public Object read(Object object) {
        System.out.println("Read " + object.getClass().getSimpleName() + " from a NoSQL DB");
        return object;
    }

    @Override
    public Object update(Object object) {
        System.out.println("Update " + object.getClass().getSimpleName() + " in a NoSQL DB");
        return object;
    }

    @Override
    public void delete(Object object) {
        System.out.println("Delete " + object.getClass().getSimpleName() + " from a NoSQL DB");
    }
}
