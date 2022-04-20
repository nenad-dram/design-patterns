package com.endyary.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Users implements AuthData {
    private List<Credentials> collection;

    public Users() {
        this.collection = new ArrayList<>();

        Credentials user1 = new Credentials("user1", "pass1");
        Credentials user2 = new Credentials("user2", "pass2");
        Credentials user3 = new Credentials("user3", "pass3");

        this.collection.add(user1);
        this.collection.add(user2);
        this.collection.add(user3);
    }

    @Override
    public Iterator<Credentials> createIterator() {
        return collection.iterator();
    }
}
