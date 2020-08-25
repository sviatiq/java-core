package lesson1.zooclub;

public class Pet {
    private PetType petType;
    private String name;
    private int age;

    public Pet() {
    }

    public Pet(PetType petType, String name, int age) {
        this.petType = petType;
        this.name = name;
        this.age = age;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType=" + petType +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
