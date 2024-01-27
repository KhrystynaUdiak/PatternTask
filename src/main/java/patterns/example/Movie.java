package patterns.example;

import java.io.Serializable;

public class Movie implements Serializable {

    private final String title;
    private final MovieType priceCode;
    private Genre genre;
    private String country;
    private String description;
    private String producer;

    public MovieType getPriceCode() {
        return this.priceCode;
    }
    public String getTitle() {
        return title;
    }
    public Genre getGenre() {
        return genre;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    public String getProducer() {
        return producer;
    }


    public static class Builder {
        private final String title;
        private final MovieType priceCode;
        private Genre genre;
        private String country;
        private String description;
        private String producer;

        @Override
        public String toString() {
            return "Builder{" +
                    ", title='" + title + '\'' +
                    ", priceCode=" + priceCode +
                    ", genre=" + genre +
                    ", country='" + country + '\'' +
                    ", description='" + description + '\'' +
                    ", producer='" + producer + '\'' +
                    '}';
        }

        public Builder(String title, MovieType priceCode) {
            this.title = title;
            this.priceCode = priceCode;
        }


        public Builder genre(Genre genre) {
            this.genre = genre;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder producer(String producer) {
            this.producer = producer;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }
    }
        private Movie(Builder builder){
            title = builder.title;
            priceCode = builder.priceCode;
            genre = builder.genre;
            country = builder.country;
            description = builder.description;
            producer = builder.producer;
        }
    }
