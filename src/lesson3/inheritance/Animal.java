package lesson3.inheritance;

public class Animal {
    private int numOfEyes;


    public Animal() {
    }

    public Animal(int numOfEyes) {
        this.numOfEyes = numOfEyes;
    }

    void showInfo(){
        System.out.println("This is animal!");
    }
}
