package com.endyary.patterns.behavioral.iterator;

import java.util.Iterator;

public class AccountsIterator implements Iterator<Credentials> {
    private Credentials[] list;
    private int position = 0;

    public AccountsIterator(Credentials[] list) {
        this.list = list;
    }

    @Override
    public Credentials next() {
        Credentials credentials = list[position];
        position = position + 1;
        return credentials;
    }

    @Override
    public boolean hasNext() {
        return position < list.length && list[position] != null;
    }
}
