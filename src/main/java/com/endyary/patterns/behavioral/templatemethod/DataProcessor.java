package com.endyary.patterns.behavioral.templatemethod;

public abstract class DataProcessor {

    public final void process() {
        String data = read();
        validate(data);
        String result = modify(data);
        save(result);
    }

    protected abstract String read();

    protected abstract void save(String data);

    private void validate(String data) {
        System.out.println("Validate: " + data);
    }

    private String modify(String data) {
        System.out.println("Modify: " + data);
        return data + " - OK";
    }
}
