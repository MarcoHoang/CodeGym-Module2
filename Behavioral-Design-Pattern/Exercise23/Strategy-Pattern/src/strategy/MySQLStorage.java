package strategy;

import config.DBConfig;
import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MySQLStorage implements UserStorage {

    @Override
    public void store(User user) {
        String sql = "INSERT INTO users(name, email) VALUES (?, ?)";
        try (
                Connection connection = DBConfig.getConnection();
                PreparedStatement statement = connection.prepareStatement(sql)
        ) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.executeUpdate();
            System.out.println("User stored in MySQL database.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
