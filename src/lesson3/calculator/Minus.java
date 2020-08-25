package lesson3.calculator;

public class Minus implements Calculator{
    private String message = "ууууууууу";


    @Override
    public void calculate(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    public void scream() {
        System.out.println(message);
    }

}
