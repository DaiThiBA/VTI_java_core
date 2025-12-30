package Assignment_5.Exercise2.Question5;

public class Program {
    public static void main(String[] args) {

        System.out.println("=== Điện thoại cổ điển ===");
        ClassicPhone classic = new ClassicPhone();
        classic.call();
        classic.sendMessage();
        classic.listenRadio();
        classic.attack();

        System.out.println("\n=== Điện thoại thông minh ===");
        SmartPhone smart = new SmartPhone();
        smart.call();
        smart.use3G();
        smart.takePhoto();
        smart.attack();
    }
}
