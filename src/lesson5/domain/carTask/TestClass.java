package lesson5.domain.carTask;

import lesson5.domain.Contact;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class TestClass {
    public static void main(String[] args) {


        Car car1 = new Car("AUDI", 300, new Owner("Sviat", 21, 2), 119000, 2019);
        Car car2 = new Car("Bentley", 300, new Owner("Juliana", 21, 1), 250000, 2020);
        Car car3 = new Car("Mercedes", 320, new Owner("Vlad", 21, 5), 150000, 2020);
        Car car4 = new Car("BMW", 250, new Owner("Vasya", 19, 7), 20000, 2012);
        Car car5 = new Car("Ford", 260, new Owner("Nastia", 24, 3), 10000, 2010);
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

        //todo //Зробити половину автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
        //        //На відремонтовані автомобілі найняти нових водіїв (переприсвоїти змінну водій).
        //        //Далі необхідно рати кожну другу машинку (цикл з кроком в 2), та робити їй підвищення потужності двигуна на 10% та ціну на 5%
        //        //Після того зробити перевірку досвіду ВСІХ наших водіїв. Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
        //        //Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто в циклі

    }
}
