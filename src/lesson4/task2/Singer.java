package lesson4.task2;

public class Singer implements SingerInterface{
    private String name;
    private int singYear;

    public Singer() {
    }

    public Singer(String name, int singYear) {
        this.name = name;
        this.singYear = singYear;
    }

    @Override
    public void sing() {
        System.out.println("HELLO, MY LOVE!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSingYear() {
        return singYear;
    }

    public void setSingYear(int singYear) {
        this.singYear = singYear;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", singYear='" + singYear + '\'' +
                '}';
    }
}
