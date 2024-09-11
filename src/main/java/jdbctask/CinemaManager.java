package jdbctask;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CinemaManager {

    public void addMovie(Movie movie) throws SQLException, ClassNotFoundException {

        PreparedStatement preparedStatement = JdbcUtil.connection().prepareStatement("insert into movie" +
                " (name,releaseYear,details,categoryId) values (?,?,?,?)");
        preparedStatement.setString(1, movie.getName());
        preparedStatement.setInt(2, movie.getReleaseYear());
        preparedStatement.setString(3, movie.getDetails());
        preparedStatement.setInt(4, movie.getCategory().getId());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        JdbcUtil.connection().close();
    }

    public void removeMovie(int movieId) throws SQLException, ClassNotFoundException {
        PreparedStatement preparedStatement = JdbcUtil.connection().prepareStatement("delete from movie" +
                " where id=?");
        preparedStatement.setInt(1, movieId);
        preparedStatement.executeUpdate();
        preparedStatement.close();
        JdbcUtil.connection().close();

    }

    public void listMovies() throws SQLException, ClassNotFoundException {
        Statement statement = JdbcUtil.connection().createStatement();


    }

    public void updateMovieReleaseYear(int movieId, int newReleaseYear) throws SQLException {
    }
}
