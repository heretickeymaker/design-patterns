package strategy.race.controllers;

import static java.lang.System.out;

public class Properties {
    public PropertyAlgorithm algorithm;

    public void showScore(int distance) {
        out.format("Score for %s is %s%n", algorithm.model(), algorithm.calculate(distance));
    }

    public void reset() {
        algorithm = null;
    }
}
