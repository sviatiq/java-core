package lesson4.task1;

public class Kvadrat implements Square {
    private int firstSide;
    private int secondSide = firstSide;

    public Kvadrat() {
    }

    public Kvadrat(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public String toString() {
        return "Kvadrat{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                '}';
    }

    @Override
    public double square() {
        return this.firstSide*this.secondSide;
    }
}
