package com.endyary.patterns.structural.bridge;

public class UserRepository extends Repository {
    public UserRepository(Persistence persistence) {
        super(persistence);
    }

    public User create(User user) {
        return (User) persistence.create(user);
    }

    public User read(User user) {
        return (User) persistence.read(user);
    }

    public User update(User user) {
        return (User) persistence.update(user);
    }

    public void delete(User user) {
        persistence.delete(user);
    }
}
