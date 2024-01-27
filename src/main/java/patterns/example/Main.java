package patterns.example;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Main.run();
    }

    public static void run() {
        Catalog catalog = new Catalog();

        Movie rambo = new Movie.Builder("Rambo", new RegularMovieType())
                .build();
        Movie lordOfTheRings = new Movie.Builder("Lord of the Rings", new ReleaseMovieType())
                .genre(Genre.FANTASY)
                .build();
        Movie harryPotter = new Movie.Builder("Harry Potter", new ChildrensMovieType())
                .genre(Genre.FANTASY)
                .country("Great Britain")
                .build();

        catalog.addMovie(rambo);
        catalog.addMovie(lordOfTheRings);
        catalog.addMovie(harryPotter);

        catalog.viewCatalog("file");

        List<Rental> rentals = List.of(
                new Rental(rambo, 1),
                new Rental(lordOfTheRings, 4),
                new Rental(harryPotter, 5));

        Customer customer = new Customer("John Doe", rentals);
        customer.viewCustomerRentalStatement("file");
    }
}