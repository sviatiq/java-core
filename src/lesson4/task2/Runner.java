package lesson4.task2;

public class Runner implements RunnerInterface{
    private String name;
    private int age;

    public Runner() {
    }

    public Runner(String name, int age) {
        this.name = name;
        this.age = age;
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
    public void run() {
        System.out.println("Run, Forest, run!");
    }


    @Override
    public String toString() {
        return "Runner{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
