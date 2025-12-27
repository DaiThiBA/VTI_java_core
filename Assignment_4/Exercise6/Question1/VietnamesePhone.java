package Assignment_4.Exercise6.Question1;

public class VietnamesePhone extends Phone{
    @Override
    public void insertContact(String name, String phone) {
        this.getContacts().put(name, phone);
    }

    @Override
    public void removeContact(String name) {
        this.getContacts().remove(name);
    }

    @Override
    public void updateContact(String name, String newPhone) {
        if (this.getContacts().containsKey(name)) {
            this.getContacts().put(name, newPhone);
        }
    }

    @Override
    public void searchContact(String name) {
        if (this.getContacts().containsKey(name)) {
            System.out.println(name + ": " + this.getContacts().get(name));
        } else {
            System.out.println("Không tìm thấy");
        }
    }
}
