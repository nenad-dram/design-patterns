package com.endyary.patterns.behavioral.iterator;

import java.util.Iterator;

public interface AuthData {
    Iterator<Credentials> createIterator();
}
