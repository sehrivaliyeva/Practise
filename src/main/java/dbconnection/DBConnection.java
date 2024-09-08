package dbconnection;

import java.sql.*;

public class DBConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project-jdbc", "root", "1234");
         Statement statement = connection.createStatement();
       /* statement.executeUpdate("CREATE TABLE students (\n" +
                "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                "    name VARCHAR(100) NOT NULL,\n" +
                "    surname VARCHAR(100) NOT NULL,\n" +
                "    age INT\n" +
                ");" // Sorğunu bitirmək üçün nöqtəli vergül əlavə edin

        );*/


      /*  statement.executeUpdate("INSERT INTO students (name, surname, age)\n" +
                "VALUES\n" +
                "('Ali', 'Aliyev', 20),\n" +
                "('Leyla', 'Hasanova', 22),\n" +
                "('Murad', 'Quliyev', 19),\n" +
                "('Aysel', 'Mammadova', 21)");*/

       ResultSet resultSet = statement.executeQuery("select * from students");
        while (resultSet.next()) {
            String name = resultSet.getString("name");
            String surname = resultSet.getString("surname");
            int age = resultSet.getInt("age");
            System.out.println(name + "" + surname + "" + age);
        }

        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO students (id,name, surname, age) VALUES (?, ?, ?,?)");
        preparedStatement.setInt(1, 5); // Üçüncü parametr üçün 3 indeks olmalıdır
        preparedStatement.setString(2, "Xeyal"); // İlk parametr üçün 1 indeks olmalıdır
        preparedStatement.setString(3, "Ibadov"); // İkinci parametr üçün 2 indeks olmalıdır
        preparedStatement.setInt(4, 21); // Üçüncü parametr üçün 3 indeks olmalıdır

        preparedStatement.executeUpdate();
        System.out.println("Salam");

// Resursları düzgün bağlamaq
        preparedStatement.close();
        connection.close();


    }
}