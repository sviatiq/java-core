package lesson3.inheritance;

public class Dog extends Pet {
    private int levelOfDevotion;

    public Dog(int numOfEyes, String typeOfPet, int levelOfDevotion) {
        super(numOfEyes, typeOfPet);
        this.levelOfDevotion = levelOfDevotion;

    }

    public int getLevelOfDevotion() {
        return levelOfDevotion;
    }

    public void setLevelOfDevotion(int levelOfDevotion) {
        this.levelOfDevotion = levelOfDevotion;
    }

    @Override
    void showInfo() {
        System.out.println("This is dog!");
    }

    @Override
    void saySomething() {
        System.out.println("Roof-roof!");
    }

    void takeFood(){
        levelOfDevotion++;
        System.out.println("You take your dog some meat. Level of devotion increased");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "levelOfDevotion='" + levelOfDevotion + '\'' +
                '}';
    }


}
