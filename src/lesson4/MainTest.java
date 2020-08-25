package lesson4;

public class MainTest {
    public static void main(String[] args) {
        Kvadrat k = new Kvadrat(2, 2);
        Rectangle r = new Rectangle(2, 4);
        System.out.println(k.square());
        System.out.println(r.square());
    }
}
