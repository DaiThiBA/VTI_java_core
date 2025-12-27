package Assignment_4.Exercise4.Question2;

public class Account {
    private int id;

    private String name;

    private int balance;

    public Account(int id, int balance, String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void credit(int amount) {
        if (amount <= 0){
            System.out.println("Số tiền nạp vào không hợp lệ !!!");
            return;
        }

        this.balance += amount;
    }

    public void debit(int amount) {
        if (amount <= 0) {
            System.out.println("Số tiền nạp vào không hợp lệ !!!");
            return ;
        }
        if (this.balance < amount) {
            System.out.println("Số tiền còn lại không đủ!!!");
            return;
        }
        this.balance -= amount;
    }


    public void transferTo(Account account, int amount) {
        if (account == null ) {
            System.out.println("Account không tồn tại");
            return;
        }
        if (amount <= 0) {
            System.out.println("Số tiền chuyển không hợp lệ !!!");
            return;
        }
        int before = this.balance;
        this.debit(amount);
        if (this.balance < before) {  // debit thành công
            account.credit(amount);
        }
    }
}
