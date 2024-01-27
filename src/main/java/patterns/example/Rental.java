package patterns.example;

class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;

    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
    public String statement(Customer customer) {
        double totalAmount = 0;
        int frequentRenterPoints = 0;

        String result = "Rental Record for " + customer.getName() + "\n";

        totalAmount += getMovie().getPriceCode().getCharge(getDaysRented());
        frequentRenterPoints += getMovie().getPriceCode().getFrequentPoints(getDaysRented());

        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points";
        return result;
    }

}
