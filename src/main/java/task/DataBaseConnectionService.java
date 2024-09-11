package task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnectionService {
    private final String username;
    private final String password;
    private final String url;

    {
        File file = new File("credentials.txt");

        FileReader reader = null;
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        char[] response = new char[(int) file.length()];

        try {
            reader.read(response);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String res = String.valueOf(response);


        int indexUserStart = res.indexOf("{") + 1;
        int indexUserStop = res.indexOf("}");

        int indexPassStart = res.indexOf("$") + 1;
        int indexPassStop = res.indexOf("$$");

        int indexurlStart = res.indexOf("@")+1;
        int indexurlStop = res.indexOf("@@");

        username = res.substring(indexUserStart, indexUserStop);
        password = res.substring(indexPassStart, indexPassStop);
        url = res.substring(indexurlStart, indexurlStop);

    }

    public Connection getConnection() throws SQLException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);


        return connection;
    }
}
