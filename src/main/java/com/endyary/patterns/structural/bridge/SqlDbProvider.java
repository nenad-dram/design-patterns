package com.endyary.patterns.structural.bridge;

public class SqlDbProvider implements Persistence {
    @Override
    public Object create(Object object) {
        System.out.println("Create " + object.getClass().getSimpleName() + " in a SQL DB");
        return object;
    }

    @Override
    public Object read(Object object) {
        System.out.println("Read " + object.getClass().getSimpleName() + " from a SQL DB");
        return object;
    }

    @Override
    public Object update(Object object) {
        System.out.println("Update " + object.getClass().getSimpleName() + " in a SQL DB");
        return object;
    }

    @Override
    public void delete(Object object) {
        System.out.println("Delete " + object.getClass().getSimpleName() + " from a SQL DB");
    }
}
