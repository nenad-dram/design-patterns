package com.endyary.patterns.behavioral.templatemethod;

public class FileDataProcessor extends DataProcessor {
    @Override
    protected String read() {
        String data = "File data";
        System.out.println("Read: " + data);
        return data;
    }

    @Override
    protected void save(String data) {
        System.out.println("Save: " + data);
    }
}
