package lesson1.zooclub;

public class Person {
    private String name;
    private Pet pet;

    public Person() {
    }

    public Person( String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }
}
