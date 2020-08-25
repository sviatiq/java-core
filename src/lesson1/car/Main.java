package lesson1.car;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Audi", 2020, 6831, "red", new Engine("engine1", 120, 300), new Wheel("citizen", 40));
        Car car2 = new Car("Ferrari", 2010, 2921, "green", new Engine("engine2", 200, 400), new Wheel("citizen", 30));
        Car car3 = new Car("Bentli", 2001, 1251, "black", new Engine("engine3", 100, 100), new Wheel("citizen", 30));
        Car car4 = new Car("BMW", 1990, 1943, "white", new Engine("engine3", 150, 600), new Wheel("citizen", 35));
        Car car5 = new Car("Mercedes", 1965, 1240, "black", new Engine("engine4", 300, 100), new Wheel("citizen", 50));
        Car car6 = new Car("Bently", 2000, 0021, "white", new Engine("engine6", 500, 200), new Wheel("citizen", 45));
        List carList = new ArrayList<Car>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);


        System.out.println(carList);

    }
}
