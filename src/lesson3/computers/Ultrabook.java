package lesson3.computers;

public class Ultrabook extends Computer{
    private double weight;

    public Ultrabook() {
    }

    public Ultrabook(String model, double weight) {
        super(model);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "weight=" + weight +
                '}';
    }
}
