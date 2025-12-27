package Assignment_4.Exercise1;

import Done.Assignment_1.Question_1.Department;
import Done.Assignment_1.Question_1.Position;

import java.time.LocalDate;

public class Account {
    private int id;
    private String email;
    private String userName;
    private String firstName;
    private String lastName;
    private String fullName;
    private Done.Assignment_1.Question_1.Department department;
    private Position position;
    private LocalDate createDate;

//    Question 2:
//    Tạo constructor cho Account:
//    a) Không có parameters
    public Account() {

    }
    //    b) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)
    public Account(int id, String email, String username,String firstName, String lastName  ) {
        this.id = id;
        this.email = email;
        this.userName = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;
    }

    //    c) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và Position của User, default createDate = now
    public Account(int id, String email, String username,String firstName, String lastName, Position position) {
        this.id = id;
        this.email = email;
        this.userName = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;
        this.position = position;
        this.createDate = LocalDate.now();
    }

    //    d) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và Position của User, createDate.
    public Account(int id, String email, String username,String firstName, String lastName, Position position, LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.userName = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + lastName;
        this.position = position;
        this.createDate = createDate;
    }

    //    Khởi tạo 1 Object với mỗi constructor ở trên.

    public Account(int id, String email, String username, String fullName, Done.Assignment_1.Question_1.Department department, Position position, LocalDate createDate) {
        this.id = id;
        this.email = email;
        this.userName = username;
        this.fullName = fullName;
        this.department = department;
        this.position = position;
        this.createDate = createDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Done.Assignment_1.Question_1.Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

//    @Override
//    public String toString() {
//        return "Thông tin account thứ " + id + " là:\n"
//                + "Email: " + email + "\n"
//                + "Full name: " + fullName + "\n"
//                + "Phòng ban: " + department;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        // 1. So sánh cùng địa chỉ
//        if (this == obj) {
//            return true;
//        }
//
//        // 2. Kiểm tra null
//        if(obj == null) {
//            return false;
//        }
//
//        // 3. Kiểm tra cùng class
//        if( getClass() != obj.getClass()){
//            return false;
//        }
//        // 4. Ép kiểu để gọi được thuộc tính
//        Account other = (Account) obj;
//
//        // 5. So sánh thuộc tính
//        return id == other.getId();
//
//    }
}
