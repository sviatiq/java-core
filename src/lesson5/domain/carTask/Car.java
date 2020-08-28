package lesson5.domain.carTask;

import java.util.Objects;

public class Car {
    private String model;
    private double power;
    private Owner owner;
    private double price;
    private int yearOfManufacture;


    public Car() {
    }

    public Car(String model, double power, Owner owner, double price, int yearOfManufacture) {
        this.model = model;
        this.power = power;
        this.owner = owner;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", owner=" + owner +
                ", price=" + price +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.power, power) == 0 &&
                Double.compare(car.price, price) == 0 &&
                yearOfManufacture == car.yearOfManufacture &&
                Objects.equals(model, car.model) &&
                Objects.equals(owner, car.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, power, owner, price, yearOfManufacture);
    }
}
