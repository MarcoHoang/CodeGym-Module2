package app;

import controller.UserController;
import model.User;
import strategy.UserStorage;
import strategy.XMLStorage;

public class MainXML {
    public static void main(String[] args) {
        User user = new User("Nguyen Van A", "a@example.com");
        UserStorage storage = new XMLStorage();
        UserController controller = new UserController(storage);
        controller.store(user);
    }
}

