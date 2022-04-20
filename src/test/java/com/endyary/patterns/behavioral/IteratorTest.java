package com.endyary.patterns.behavioral;

import com.endyary.patterns.behavioral.iterator.Accounts;
import com.endyary.patterns.behavioral.iterator.AuthData;
import com.endyary.patterns.behavioral.iterator.Credentials;
import com.endyary.patterns.behavioral.iterator.Users;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

public class IteratorTest {

    @Test
    void credentialsIteratorTest() {
        AuthData users = new Users();
        AuthData accounts = new Accounts();

        Iterator<Credentials> usersIter = users.createIterator();
        Iterator<Credentials> accountsIter = accounts.createIterator();
        printData(usersIter);
        printData(accountsIter);
    }

    private void printData(Iterator<Credentials> iterator) {
        while (iterator.hasNext()) {
            Credentials credentials = iterator.next();
            System.out.println(credentials.getUsername() + " - " + credentials.getPassword());
        }
    }
}
