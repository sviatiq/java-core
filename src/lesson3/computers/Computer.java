package lesson3.computers;

public class Computer {
    private String model;


    public Computer() {
    }

    public Computer(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                '}';
    }
}
