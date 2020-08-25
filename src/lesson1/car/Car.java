package lesson1.car;

public class Car {
    private String model;
    private int year;
    private int number;
    private String color;
    private Engine engine;
    private Wheel wheel;

    public Car() {
    }

    public Car(String model, int year, int number, String color, Engine engine, Wheel wheel) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.color = color;
        this.engine = engine;
        this.wheel = wheel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", number=" + number +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }
}
