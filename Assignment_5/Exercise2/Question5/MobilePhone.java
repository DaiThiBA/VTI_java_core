package Assignment_5.Exercise2.Question5;

public abstract class MobilePhone  implements IWeapon{
    public void call() {
        System.out.println("Gọi điện");
    }

    public void receiveCall() {
        System.out.println("Nhận cuộc gọi");
    }

    public void sendMessage() {
        System.out.println("Gửi tin nhắn");
    }

    public void receiveMessage() {
        System.out.println("Nhận tin nhắn");
    }
}
