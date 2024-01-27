package patterns.example;

public class RegularMovieType extends MovieType{
    @Override
    double getCharge(int days) {
        double amount = 2;
        if (days > 2)
            amount += (days - 2) * 1.5;
        return amount;
    }

}
