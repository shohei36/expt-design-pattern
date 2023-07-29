package code.facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// データベース名を指定して、それに対応したPropertiesを作成する
public class Database {
    private Database() {}

    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
