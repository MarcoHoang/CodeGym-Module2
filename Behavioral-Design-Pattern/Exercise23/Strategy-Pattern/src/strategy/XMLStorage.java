package strategy;

import model.User;
import java.io.FileWriter;
import java.io.IOException;

public class XMLStorage implements UserStorage {

    @Override
    public void store(User user) {
        try (FileWriter writer = new FileWriter("user.xml")) {
            writer.write("<user>\n");
            writer.write("  <name>" + user.getName() + "</name>\n");
            writer.write("  <email>" + user.getEmail() + "</email>\n");
            writer.write("</user>");
            System.out.println("User stored in XML file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

