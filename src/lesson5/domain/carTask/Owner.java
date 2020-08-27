package lesson5.domain.carTask;

public class Owner {
    private String name;
    private int age;
    private int drivingSkill;

    public Owner() {
    }

    public Owner(String name, int age, int drivingSkill) {
        this.name = name;
        this.age = age;
        this.drivingSkill = drivingSkill;
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

    public int getDrivingSkill() {
        return drivingSkill;
    }

    public void setDrivingSkill(int drivingSkill) {
        this.drivingSkill = drivingSkill;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", drivingSkill=" + drivingSkill +
                '}';
    }
}
