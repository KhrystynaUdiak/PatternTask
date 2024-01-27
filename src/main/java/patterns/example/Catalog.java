package patterns.example;

import java.util.ArrayList;
import java.util.List;

public class Catalog {

    private List<Movie> movieList;

    public Catalog(){
        this.movieList = new ArrayList<>();
    }
    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public List<Movie> addMovie(Movie movie){
         movieList.add(movie);
         return movieList;
    }

    public Movie getByName(String name){
        for(Movie movie : movieList){
            if(movie.getTitle().equals(name)){
                return movie;
            }
        }
        System.out.println("There is no such movie");
        return null;
    }

    public void viewCatalog(String view){
        for(Movie movie : movieList){
            if (view.equals("Html")) {
                new HtmlView().view(movie.toString());
            } else if(view.equals("file")){
                new FileView().view(movie);
            }
        }
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "movieList=" + movieList +
                '}';
    }
}
