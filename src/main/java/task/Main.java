package task;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        DataBaseConnectionService dataBaseConnectionService=new DataBaseConnectionService();
        dataBaseConnectionService.getConnection();
    }
}
