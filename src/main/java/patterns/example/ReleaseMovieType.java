package patterns.example;

public class ReleaseMovieType extends MovieType {

    @Override
    double getCharge(int days) {
        return days * 3;
    }

    @Override
    protected int getFrequentPoints(int days) {
        return days > 1 ? 2 : 1;
    }
}
