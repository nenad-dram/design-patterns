package com.endyary.patterns.behavioral.templatemethod;

public class DBDataProcessor extends DataProcessor {

    @Override
    protected String read() {
        String data = "DB data";
        System.out.println("Read: " + data);
        return data;
    }

    @Override
    protected void save(String data) {
        System.out.println("Save: " + data);
    }

}
