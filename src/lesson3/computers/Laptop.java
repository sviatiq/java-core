package lesson3.computers;

public class Laptop extends Computer{
    private double displaySize;

    public Laptop() {
    }

    public Laptop(String model, double displaySize) {
        super(model);
        this.displaySize = displaySize;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "displaySize=" + displaySize +
                '}';
    }
}
