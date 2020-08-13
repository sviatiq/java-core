package lesson1.task1;

public class Person {
    public String name;
    public String surname;
    public int age;
    public Email email;
    public Pet pet;

    public Person() {
    }

    public Person(String name, String surname, int age, Email email, Pet pet) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email=" + email +
                ", pet=" + pet +
                '}';
    }
}
