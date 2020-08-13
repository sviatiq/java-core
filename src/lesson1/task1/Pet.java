package lesson1.task1;

public class Pet {
    private String nickname;
    private int age;

    public Pet() {
    }

    public Pet(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public void roof(){
        System.out.println("Roof-roof");
    }
    //OR
    public String roofRoof(){
       return "Roof-roof";
    }

    public void piss(){
        System.out.println("Piss anywhere");
    }
    //OR
    public String pissPiss(){
        return "Piss anywhere";
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
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
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }
}
