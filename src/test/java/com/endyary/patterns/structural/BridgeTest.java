package com.endyary.patterns.structural;

import com.endyary.patterns.structural.bridge.*;
import org.junit.jupiter.api.Test;

public class BridgeTest {

    @Test
    void testPersistenceBridge() {
        Persistence sqlDbProvider = new SqlDbProvider();
        Persistence noSqlDbProvider = new NoSqlDbProvider();

        User user = new User("UserName", "user@mail.com");
        Book book = new Book("BookTitle", "BookAuthor");

        Repository userRepository = new UserRepository(sqlDbProvider);
        Repository bookRepository = new BookRepository(noSqlDbProvider);

        userRepository.create(user);
        bookRepository.create(book);

        userRepository.delete(user);
        bookRepository.delete(book);
    }
}
