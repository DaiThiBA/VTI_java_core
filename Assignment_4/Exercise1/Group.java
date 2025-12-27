package Assignment_4.Exercise1;

import java.time.LocalDate;

public class Group {
    private int id;
    private String name;
    private Account creator;
    private Account[] accounts;
    private LocalDate createDate;

//    Tạo constructor cho Group:



//    Khởi tạo 1 Object với mỗi constructor ở trên.


    //    a) Không có parameters
    public Group(){

    }
    //    b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
    public Group(String name, Account creator, Account[] accounts,LocalDate createDate) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }

    //    c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
//    Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin còn lại = null).
    public Group(int id, String name, Account creator, String[] usernames, LocalDate createDate) {
        this.id = id;
        this.name = name;
        this.creator = creator;
        this.createDate = createDate;

        if (usernames != null) {
            this.accounts = new Account[usernames.length];

            for (int i = 0; i < usernames.length; i++) {
                Account acc = new Account();
                acc.setUsername(usernames[i]);
                // các field khác mặc định = null
                this.accounts[i] = acc;
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Done.Assignment_1.Question_1.Account getCreator() {
//        return creator;
//    }
//
//    public void setCreator(Account creator) {
//        this.creator = creator;
//    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
}
