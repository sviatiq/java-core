package lesson4;

public class Rectangle implements Square{
    private int firstSide;
    private int secondSide;

    public Rectangle() {
    }

    public Rectangle(int firstSide, int secondSide) {
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
        return "Rectangle{" +
                "firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                '}';
    }

    @Override
    public double square() {
        return this.firstSide*this.secondSide;
    }
}
