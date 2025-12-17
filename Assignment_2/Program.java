package Assignment_2;

import Assignment_1.Question_1.*;

import java.time.LocalDate;

public class Program {
    static Department depSale;
    static Department depMarketing;
    static Department depIT;
    static Department[] departments;

    static Position posDev;
    static Position posTest;
    static Position posScrum;
    static Position posPM;
    static Position[] positions;

    static Account acc1;
    static Account acc2;
    static Account acc3;
    static Account acc4;
    static Account[] accounts;

    static Group groupJava;
    static Group groupCSharp;
    static Group groupBackend;
    static Group groupFrontend;
    static Group[] groups;

    static GroupAccount ga1;
    static GroupAccount ga2;
    static GroupAccount ga3;

    static GroupAccount ga4;
    static GroupAccount ga5;

    static GroupAccount ga6 ;
    static GroupAccount ga7 ;
    static GroupAccount ga8 ;
    static GroupAccount ga9 ;

    static GroupAccount[] groupAccounts;

    static Exam exam1;
    static Exam exam2;
    static Exam[] exams;

    static CategoryQuestion cateJava;
    static CategoryQuestion cateSQL;
    static CategoryQuestion[] categories;



    public static void main(String[] args) {
        initData();

//        question_1();
//        question_2();

//        question_3();
    }

    //    Question 1:
    //    Kiểm tra account thứ 2
    //    Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
    //    Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"

    public static void question_1(){
        if(acc2.getDepartment() == null ){
            System.out.println("Nhân viên này chưa có phòng ban");
        }
        else{
            System.out.println("Phòng ban của nhân viên này là" + acc2.getDepartment());
        }
    }

    //    Question 2:
    //    Kiểm tra account thứ 2 (group_account)
    //    Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
    //    Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
    //    Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
    //    Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
    public static void question_2(){
        int count = 0;
        int i = 0;

        for(GroupAccount ga : groupAccounts){
            Account acc = ga.getAccount();

            if(acc.equals(acc2)){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Nhân viên này chưa có group");
        } else if (count == 1 || count == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (count == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

    }

    //    Question 3:
    //    Sử dụng toán tử ternary để làm Question 1
    public static void question_3(){
        String mess = (acc2.getDepartment() == null
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là" + acc2.getDepartment() );

        System.out.println(mess);
    }

    //    Question 4:
    //    Sử dụng toán tử ternary để làm yêu cầu sau:
    //    Kiểm tra Position của account thứ 1
    //    Nếu Position = Dev thì in ra text "Đây là Developer"
    //    Nếu không phải thì in ra text "Người này không phải là Developer"
    public static void question_4(){

    }

    static void initData() {

        // ===== DEPARTMENT =====
        depSale = new Department(1, "Sale");
        depMarketing = new Department(2, "Marketing");
        depIT = new Department(3, "IT");
        departments = new Department[]{depSale, depMarketing, depIT};

        // ===== POSITION =====
        posDev = new Position(1, PositionName.DEV);
        posTest = new Position(2, PositionName.TEST);
        posScrum = new Position(3, PositionName.SCRUM_MASTER);
        posPM = new Position(4, PositionName.PM);
        positions = new Position[]{posDev, posTest, posScrum, posPM};

        // ===== ACCOUNT =====
        acc1 = new Account(
                1,
                "a@gmail.com",
                "user1",
                "Nguyen Van A",
                depSale,
                posDev,
                LocalDate.now().minusDays(10)
        );

        // account KHÔNG có department → dùng cho IF, ternary
        acc2 = new Account(
                2,
                "b@gmail.com",
                "user2",
                "Tran Thi B",
                null,
                posTest,
                LocalDate.now().minusDays(5)
        );

        acc3 = new Account(
                3,
                "c@gmail.com",
                "user3",
                "Le Van C",
                depMarketing,
                posDev,
                LocalDate.now().minusDays(1)
        );

        acc4 = new Account(
                4,
                "d@gmail.com",
                "user4",
                "Pham Van D",
                depIT,
                posPM,
                LocalDate.now()
        );

        accounts = new Account[]{acc1, acc2, acc3, acc4};

        // ===== GROUP =====
        groupJava = new Group(1, "Java Fresher", acc1, LocalDate.now().minusDays(30));
        groupCSharp = new Group(2, "C# Fresher", acc1, LocalDate.now().minusDays(25));
        groupBackend = new Group(3, "Backend Team", acc3, LocalDate.now().minusDays(20));
        groupFrontend = new Group(4, "Frontend Team", acc4, LocalDate.now().minusDays(15));
        groups = new Group[]{groupJava, groupCSharp, groupBackend, groupFrontend};

        // acc1 tham gia 3 group
         ga1 = new GroupAccount(groupJava, acc1, LocalDate.now().minusDays(20));
         ga2 = new GroupAccount(groupCSharp, acc1, LocalDate.now().minusDays(18));
         ga3 = new GroupAccount(groupBackend, acc1, LocalDate.now().minusDays(15));

        // acc2 KHÔNG tham gia group (cố tình không tạo)

        // acc3 tham gia 2 group
         ga4 = new GroupAccount(groupJava, acc3, LocalDate.now().minusDays(10));
         ga5 = new GroupAccount(groupBackend, acc3, LocalDate.now().minusDays(8));

        // acc4 tham gia 4 group → người hóng chuyện
         ga6 = new GroupAccount(groupJava, acc4, LocalDate.now().minusDays(7));
         ga7 = new GroupAccount(groupCSharp, acc4, LocalDate.now().minusDays(6));
         ga8 = new GroupAccount(groupBackend, acc4, LocalDate.now().minusDays(5));
         ga9 = new GroupAccount(groupFrontend, acc4, LocalDate.now().minusDays(4));

         groupAccounts = new GroupAccount[]{
                ga1, ga2, ga3,
                ga4, ga5,
                ga6, ga7, ga8, ga9
        };

        // ===== CATEGORY QUESTION =====
        cateJava = new CategoryQuestion(1, "Java");
        cateSQL  = new CategoryQuestion(2, "SQL");

        categories = new CategoryQuestion[]{cateJava, cateSQL};

        // ===== EXAM =====
        exam1 = new Exam(
                1,
                "EX001",
                "Java Basic Test",
                cateJava,
                60,
                acc1,
                LocalDate.of(2020, 4, 24)
        );

        exam2 = new Exam(
                2,
                "EX002",
                "SQL Test",
                cateSQL,
                90,
                acc3,
                LocalDate.now()
        );

        exams = new Exam[]{exam1, exam2};
    }
}
