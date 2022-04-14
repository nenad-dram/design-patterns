package com.endyary.patterns.creational.prototype;

public class Robot implements Prototype {
    private int id;
    private String model;
    private String type;
    private String feature;

    private Robot(int id, String model, String type, String feature) {
        this.id = id;
        this.model = model;
        this.type = type;
        this.feature = feature;
    }

    public static Robot create(int id, String model, String type, String feature) {
        return new Robot(id, model, type, feature);
    }

    private Robot(Robot source) {
        if (source != null) {
            this.id = source.getId() + 1;
            this.model = source.model;
            this.feature = source.feature;
            this.type = source.type;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    @Override
    public Prototype clone() {
        return new Robot(this);
    }
}
