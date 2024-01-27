package patterns.example;

import java.io.Serializable;

public abstract class MovieType implements Serializable {
    abstract double getCharge(int days);
    protected int getFrequentPoints(int days) {
        return 1;
    }
}
