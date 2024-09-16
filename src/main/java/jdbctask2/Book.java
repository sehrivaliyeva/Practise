package jdbctask2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Book {
    private int id;
    private String name;
    private double price;
    private String author;
    private int pageCount;

    public Book(int id, String name, double price, String author, int pageCount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.pageCount = pageCount;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", pageCount=" + pageCount +
                '}';
    }

    public static List<Book> getAllBooks(int limit, int offset) throws SQLException {
        List<Book> books = new ArrayList<>();
        String query = "SELECT * FROM Book limit ? offset ?";

        try (MyConnection myConnection = new MyConnection();
             PreparedStatement preparedStatement = myConnection.connect().prepareStatement(query)) {

            preparedStatement.setInt(1, limit);
            preparedStatement.setInt(2, offset);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    double price = resultSet.getDouble("price");
                    String author = resultSet.getString("author");
                    int pageCount = resultSet.getInt("page_count");

                    books.add(new Book(id, name, price, author, pageCount));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return books;
    }

}
