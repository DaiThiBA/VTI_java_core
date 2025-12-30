package Assignment_5.Exercise2.Question4;

public class Program {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();

        System.out.println("Sum int: " + myMath.sum(3, 5));
        System.out.println("Sum byte: " + myMath.sum((byte) 2, (byte) 4));
        System.out.println("Sum float: " + myMath.sum(2.5f, 3.5f));
    }
}

