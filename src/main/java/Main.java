
import database.DbManager;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
        Menu.runMenu();

    }
}
