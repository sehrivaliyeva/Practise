package jdbctask;

import java.sql.*;

public class CinemaManager {

    public void addMovie(Movie movie) throws SQLException {
        String sql = "INSERT INTO movie (name, release_year, details, category_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = JDBCUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, movie.getName());
            stmt.setInt(2, movie.getReleaseYear());
            stmt.setString(3, movie.getDetails());
            stmt.setInt(4, movie.getCategory().getId());
            stmt.executeUpdate();
        }
    }

    public void removeMovie(int movieId) throws SQLException {
        String sql = "DELETE FROM movie WHERE id = ?";
        try (Connection conn = JDBCUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, movieId);
            stmt.executeUpdate();
        }
    }

    public void listMovies() throws SQLException {
        String sql = "SELECT * FROM movie";
        try (Connection conn = JDBCUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("Movie ID: " + rs.getInt("id") + ", Name: " + rs.getString("name"));
            }
        }
    }

    public void updateMovieReleaseYear(int movieId, int newReleaseYear) throws SQLException {
        String sql = "UPDATE movie SET release_year = ? WHERE id = ?";
        try (Connection conn = JDBCUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, newReleaseYear);
            stmt.setInt(2, movieId);
            stmt.executeUpdate();
        }
    }
}
