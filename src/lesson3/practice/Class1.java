package lesson3.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Class1 implements Creator{
    private int length = 20;

    @Override
    public int[] creator() {
        int arr[] = new int[length];
        for(int i = 0; i< arr.length; i++){
            arr[i] = (int)(Math.random()*200);
        }
        return arr;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "length=" + length +
                '}';
    }
}
