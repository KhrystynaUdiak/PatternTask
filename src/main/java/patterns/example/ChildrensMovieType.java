package patterns.example;

public class ChildrensMovieType extends MovieType{

    @Override
    double getCharge(int days) {
        double amount = 1.5;

        if (days > 3) {
            amount += (days - 3) * 1.5;
        }
        return amount;
    }
}
