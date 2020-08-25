package lesson3.practice;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        Class1 c1 = new Class1();
        System.out.println(Arrays.toString(c1.creator()));

        Class2 c2 = new Class2(10, 100);
        System.out.println(Arrays.toString(c2.creator()));

    }
}
