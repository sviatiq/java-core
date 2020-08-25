package lesson1.car;

public class Engine {
    private String model;
    private int capacity;
    private int power;

    public Engine() {
    }

    public Engine(String model, int capacity, int power) {
        this.model = model;
        this.capacity = capacity;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                ", power=" + power +
                '}';
    }
}
