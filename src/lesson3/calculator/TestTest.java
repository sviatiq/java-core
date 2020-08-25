package lesson3.calculator;

public class TestTest {
    static void showMessage(Plus obj1, Minus obj2){
        obj1.calculate(1,2);
        obj1.scream();
        obj2.calculate(4,2);
        obj2.scream();
    }
    public static void main(String[] args) {
        Plus p = new Plus();
        Minus m = new Minus();
        showMessage(p, m);

    }
}
