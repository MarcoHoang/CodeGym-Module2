package controller;

import model.User;
import strategy.UserStorage;

public class UserController {
    private final UserStorage storage;

    public UserController(UserStorage storage) {
        this.storage = storage;
    }

    public void store(User user) {
        storage.store(user);
    }
}

