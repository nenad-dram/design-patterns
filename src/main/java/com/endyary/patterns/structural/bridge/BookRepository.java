package com.endyary.patterns.structural.bridge;

public class BookRepository extends Repository {
    public BookRepository(Persistence persistence) {
        super(persistence);
    }

    public Object create(Book book) {
        return super.create(book);
    }

    public Object read(Book book) {
        return super.read(book);
    }

    public Object update(Book book) {
        return super.update(book);
    }

    public void delete(Book book) {
        super.delete(book);
    }
}
