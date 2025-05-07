package app;

import controller.UserController;
import model.User;
import strategy.MySQLStorage;
import strategy.UserStorage;

public class MainMySQL {
    public static void main(String[] args) {
        User user = new User("Tran Thi B", "b@example.com");
        UserStorage storage = new MySQLStorage();
        UserController controller = new UserController(storage);
        controller.store(user);
    }
}

