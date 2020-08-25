package lesson3.practice;

public class Class2 implements Creator {
    private int length;
    private int x;

    public Class2(int length, int x) {
        this.length = length;
        this.x = x;
    }

    @Override
    public int[] creator() {
        int arr[] = new int[getLength()];
        for(int i = 0; i< arr.length; i++){
            arr[i] = (int)(Math.random()*getX());
        }
        return arr;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "length=" + length +
                ", x=" + x +
                '}';
    }
}
