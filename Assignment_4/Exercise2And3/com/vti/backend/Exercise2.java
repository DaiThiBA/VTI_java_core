package Assignment_4.Exercise2And3.com.vti.backend;

import Done.Assignment_1.Question_1.Account;

import java.time.LocalDate;

public class Exercise2 {

    //    Exercise 2: Default value
    //    Question 1:
    //    Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
    //            • Email: "Email 1"
    //            • Username: "User name 1"
    //            • FullName: "Full name 1"
    //            • CreateDate: now
    public Account[] question_2_1() {
        Account[] accounts = new Account[5];
        for (int i = 0; i <= accounts.length - 1; i++) {
            accounts[i] = new Account();
            Account acc = accounts[i];
            acc.setEmail("Email " + (i + 1));
            acc.setUsername("user name " + (i + 1));
            acc.setFullName("Full name " + (i + 1));
            acc.setCreateDate(LocalDate.now());
            i++;
        }
        System.out.println(accounts[0].getFullName());

        return accounts;
    }

}
