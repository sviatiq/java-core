package lesson3.inheritance;

public class Pet extends Animal{
    private String typeOfPet;

    public Pet(int numOfEyes, String typeOfPet) {
        super(numOfEyes);
        this.typeOfPet = typeOfPet;
    }

    public String getTypeOfPet() {
        return typeOfPet;
    }

    public void setTypeOfPet(String typeOfPet) {
        this.typeOfPet = typeOfPet;
    }

    @Override
    void showInfo() {
        System.out.println("This is home pet. It's type is "+typeOfPet);
    }

    void saySomething(){
        System.out.println("What I have to tell you? Imma pet!");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "typeOfPet='" + typeOfPet + '\'' +
                '}';
    }
}
