package com.endyary.patterns.behavioral.iterator;

import java.util.Iterator;

public class Accounts implements AuthData {
    private Credentials[] collection;

    public Accounts() {
        this.collection = new Credentials[3];

        Credentials account1 = new Credentials("account1", "pass1");
        Credentials account2 = new Credentials("account2", "pass2");
        Credentials account3 = new Credentials("account3", "pass3");

        this.collection[0] = account1;
        this.collection[1] = account2;
        this.collection[2] = account3;
    }

    @Override
    public Iterator<Credentials> createIterator() {
        return new AccountsIterator(collection);
    }
}
