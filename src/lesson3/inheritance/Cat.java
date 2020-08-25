package lesson3.inheritance;

public class Cat extends Pet{
    private int numOfLifes;

    public Cat(int numOfEyes, String typeOfPet, int numOfLifes) {
        super(numOfEyes, typeOfPet);
        this.numOfLifes = numOfLifes;
    }

    public int getNumOfLifes() {
        return numOfLifes;
    }

    public void setNumOfLifes(int numOfLifes) {
        this.numOfLifes = numOfLifes;
    }

    @Override
    void showInfo() {
        System.out.println("This is cat!");
    }

    @Override
    void saySomething() {
        System.out.println("meeeew...");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "numOfLifes=" + numOfLifes +
                '}';
    }
}
