package jdbctask;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CinemaManager cinemaManager = new CinemaManager();

        Category actionCategory = new Category();
        actionCategory.setId(1);
        actionCategory.setType("Action");


        Movie inception = new Movie();
        inception.setName("Shrek");
        inception.setReleaseYear(2010);
        inception.setDetails("Interesting");
        inception.setCategory(actionCategory);


        List<String> actors = new ArrayList<>();
        actors.add("Leonardo");
        actors.add("Jon");
        inception.setActors(actors);

        try {

            cinemaManager.addMovie(inception);
            System.out.println("Butun movieler");
            cinemaManager.listMovies();

            System.out.println("Updating the release year for movie ID 2:");
            cinemaManager.updateMovieReleaseYear(2, 2012);
            cinemaManager.listMovies();


            System.out.println("Removing movie ID 3:");
            cinemaManager.removeMovie(3);
            cinemaManager.listMovies();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
