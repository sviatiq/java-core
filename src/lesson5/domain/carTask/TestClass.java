package lesson5.domain.carTask;

import lesson5.domain.Contact;

import java.util.*;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {


        Car car1 = new Car("Audi", 300, new Owner("Sviat", 21, 2), 119000, 2019);
        Car car2 = new Car("Bentley", 300, new Owner("Juliana", 21, 1), 250000, 2020);
        Car car3 = new Car("Mercedes", 320, new Owner("Vlad", 21, 5), 150000, 2020);
        Car car4 = new Car("BMW", 250, new Owner("Vasya", 19, 7), 20000, 2012);
        Car car5 = new Car("Ford", 260, new Owner("Nastia", 26, 3), 10000, 2010);
        Car car6 = new Car("Folkswagen", 300, new Owner("Valentin", 44, 20), 26000, 2018);
        Car car7 = new Car("Skoda", 300, new Owner("Maria", 27, 7), 25500, 2020);


        List<Car> cars = new LinkedList();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);

        //donetodo //Зробити половину автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
        cars.stream()
                .skip(4)
                .peek(c -> c.setPower(c.getPower()+c.getPower()*0.1))
                .forEach(System.out::println);
        //donetodo //На відремонтовані автомобілі найняти нових водіїв (переприсвоїти змінну водій).
        cars.stream()
        .filter(c -> c.getModel().equals("Ford")).
        peek(c -> c.setOwner(new Owner("Katya", 22, 4))).forEach(System.out::println);

        cars.stream()
                .filter(c -> c.getModel().equals("Folkswagen")).
                peek(c -> c.setOwner(new Owner("Ivan", 27, 8))).forEach(System.out::println);

        cars.stream()
                .filter(c -> c.getModel().equals("Skoda")).
                peek(c -> c.setOwner(new Owner("Boris", 56, 25))).forEach(System.out::println);
        //todo        //Далі необхідно брати кожну другу машинку (цикл з кроком в 2), та робити їй підвищення потужності двигуна на 10% та ціну на 5%
        cars.stream()
        .peek(car -> car.setPower(car.getPower()+(car.getPower()*0.1)))
        .peek(car ->car.setPrice(car.getPrice()+car.getPrice()*0.05))
        .forEach(System.out::println);
        //donetodo        //Після того зробити перевірку досвіду ВСІХ наших водіїв. Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
        cars.stream()
                .filter(car -> car.getOwner().getDrivingSkill() < 5 && car.getOwner().getAge() > 25)
                .peek(car -> car.getOwner().setDrivingSkill(car.getOwner().getDrivingSkill()+1)).forEach(System.out::println);
        //donetodo       //Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто в циклі
        double sum = cars.stream().mapToDouble(Car::getPrice).summaryStatistics().getSum();
        System.out.println(sum);

    }
}
