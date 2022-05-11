package com.endyary.patterns.structural.bridge;

public abstract class Repository {
    protected Persistence persistence;

    protected Repository(Persistence persistence) {
        this.persistence = persistence;
    }

    public Object create(Object object) {
        return persistence.create(object);
    }

    public Object read(Object object) {
        return persistence.read(object);
    }

    public Object update(Object object) {
        return persistence.update(object);
    }

    public void delete(Object object) {
        persistence.delete(object);
    }
}
