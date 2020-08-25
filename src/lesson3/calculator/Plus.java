package lesson3.calculator;

public class Plus implements Calculator{
    private String message = "аааааааа!!!!!";

    @Override
    public void calculate(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    public void scream() {
        System.out.println(message);
    }


}
