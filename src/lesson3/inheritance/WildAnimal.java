package lesson3.inheritance;

public class WildAnimal extends Animal{
    private String classification;


    public WildAnimal(int numOfEyes, String classification) {
        super(numOfEyes);
        this.classification = classification;
    }

    @Override
    void showInfo() {
        System.out.println("This is wild animal!");
    }

    void showClassification(){
        System.out.println("Classification of wild animal is "+ this.getClassification());
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "classification='" + classification + '\'' +
                '}';
    }
}
