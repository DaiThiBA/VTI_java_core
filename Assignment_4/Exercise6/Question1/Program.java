package Assignment_4.Exercise6.Question1;

public class Program {
    public static void main(String[] args) {
        Phone phone = new VietnamesePhone();

        phone.insertContact("Nam", "0909xxx");
        phone.insertContact("Lan", "0912xxx");

        phone.searchContact("Nam");
        phone.updateContact("Nam", "0999xxx");
        phone.searchContact("Nam");

        phone.removeContact("Lan");
        phone.searchContact("Lan");
    }
}

