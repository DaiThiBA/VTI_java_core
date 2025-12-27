package Done.Assignment_2;

import Done.Assignment_1.Question_1.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Program {
    static Department depSale;
    static Department depMarketing;
    static Department depIT;
    static List<Department> departments;

    static Position posDev;
    static Position posTest;
    static Position posScrum;
    static Position posPM;
    static ArrayList<Position> positions;

    static Account acc1;
    static Account acc2;
    static Account acc3;
    static Account acc4;
    static List<Account> accounts;

    static Group groupJava;
    static Group groupCSharp;
    static Group groupBackend;
    static Group groupFrontend;
    static List<Group> groups;

    static GroupAccount ga1;
    static GroupAccount ga2;
    static GroupAccount ga3;

    static GroupAccount ga4;
    static GroupAccount ga5;

    static GroupAccount ga6;
    static GroupAccount ga7;
    static GroupAccount ga8;
    static GroupAccount ga9;

    static List<GroupAccount> groupAccounts;

    static Exam exam1;
    static Exam exam2;
    static List<Exam> exams;

    static CategoryQuestion cateJava;
    static CategoryQuestion cateSQL;
    static List<CategoryQuestion> categories;

    public static void main(String[] args) {
        initData();

       // question_4_1();

    }

    //    Question 1:
    //    Kiểm tra account thứ 2
    //    Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
    //    Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"

    public static void question_1_1() {
        if (acc2.getDepartment() == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là" + acc2.getDepartment());
        }
    }

    //    Question 2:
    //    Kiểm tra account thứ 2 (group_account)
    //    Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
    //    Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên này là Java Fresher, C# Fresher"
    //    Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
    //    Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"
    public static void question_1_2() {
        int count = 0;

        for (GroupAccount ga : groupAccounts) {
            Account acc = ga.getAccount();

            if (acc.equals(acc2)) {
                count++;
            }
        }
        if (count == 0) {
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
    public static void question_1_3() {
        String mess = (acc2.getDepartment() == null
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là" + acc2.getDepartment());

        System.out.println(mess);
    }

    //    Question 4:
    //    Sử dụng toán tử ternary để làm yêu cầu sau:
    //    Kiểm tra Position của account thứ 1
    //    Nếu Position = Dev thì in ra text "Đây là Developer"
    //    Nếu không phải thì in ra text "Người này không phải là Developer"
    public static void question_1_4() {
        if (1 == acc1.getId()) {
            String mess = acc1.getPosition().getName().equals(PositionName.DEV)
                    ? "Đây là Developer"
                    : "Người này không phải là Developer";

            System.out.println(mess);
        }
    }

    //    Question 5:
    //    Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
    //    Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
    //    Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
    //    Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
    //    Còn lại in ra "Nhóm có nhiều thành viên"
    public static void question_1_5() {

        int count = 0;
        //  Lấy ra số lượng account trong nhóm thứ 1
        for (GroupAccount ga : groupAccounts) {
            if (ga.getGroup().getId() == 1) {
                count++;
            }
        }

        switch (count) {
            case 1: {
                System.out.println("Nhóm có một thành viên");
                break;
            }

            case 2: {
                System.out.println("Nhóm có hai thành viên");
                break;
            }
            case 3: {
                System.out.println("Nhóm có ba thành viên");
                break;
            }
            default: {
                System.out.println("Nhóm có nhiều thành viên");
                break;
            }

        }
        //
    }

    //    Question 6:
    //    Sử dụng switch case để làm lại Question 2
    public static void question_1_6() {
        int count = 0;

        for (GroupAccount ga : groupAccounts) {
            Account acc = ga.getAccount();

            if (acc.equals(acc2)) {
                count++;
            }
        }

        switch (count) {
            case 0: {
                System.out.println("Nhân viên này chưa có group");
                break;
            }
            case 1:
            case 2: {
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            }
            case 3: {
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            }
            default: {
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
            }

        }

    }

    //    Question 7:
    //    Sử dụng switch case để làm lại Question 4
    public static void question_1_7() {
        String mess = "";

        if (1 == acc1.getId()) {
            PositionName position = acc1.getPosition().getName();

            switch (position) {
                case DEV: {
                    mess = "Đây là Developer";
                    break;
                }
                default: {
                    mess = "Người này không phải là Developer";
                    break;
                }
            }

            System.out.println(mess);
        }
    }

    //    Question 8:
    //    In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
    public static void question_1_8() {
        for (Account acc : accounts) {

            int id = acc.getId();
            String email = acc.getEmail();
            String fullName = acc.getFullName();
            String department = (acc.getDepartment() != null)
                    ? acc.getDepartment().getName()
                    : "Chưa có";

            System.out.println(
                    "Thông tin account thứ " + id + " là:\n"
                            + "Email: " + email + "\n"
                            + "Full name: " + fullName + "\n"
                            + "Phòng ban: " + department
            );

        }
    }

    //    Question 9:
    //    In ra thông tin các phòng ban bao gồm: id và name
    public static void question_1_9() {
        for (Department dept : departments) {
            int id = dept.getId();
            String deptName = dept.getName();

            System.out.println(
                    "Thông tin account thứ " + id + " là:\n"
                            + "Id: " + id + "\n"
                            + "Name: " + deptName
            );
        }
    }

    //    Question 10:
    //    In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
    //    họ theo định dạng như sau:
    //    Thông tin account thứ 1 là:
    //    Email: NguyenVanA@gmail.com
    //    Full name: Nguyễn Văn A
    //    Phòng ban: Sale
    //    Thông tin account thứ 2 là:
    //    Email: NguyenVanB@gmail.com
    //    Full name: Nguyễn Văn B
    //    Phòng ban: Marketting
    public static void question_1_10() {
        for (int i = 0; i <= accounts.size() - 1; i++) {
            Account acc = accounts.get(i);

            int id = acc.getId();
            String email = acc.getEmail();
            String fullName = acc.getFullName();
            String department = (acc.getDepartment() != null)
                    ? acc.getDepartment().getName()
                    : "Chưa có";

            System.out.println(
                    "Thông tin account thứ " + id + " là:\n"
                            + "Email: " + email + "\n"
                            + "Full name: " + fullName + "\n"
                            + "Phòng ban: " + department
            );
        }
    }

    //    Question 11:
    //    In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
    //    Thông tin department thứ 1 là:
    //    Id: 1
    //    Name: Sale
    //    Thông tin department thứ 2 là:
    //    Id: 2
    //    Name: Marketing
    public static void question_1_11() {
        for (int i = 0; i <= departments.size() - 1; i++) {
            Department dept = departments.get(i);

            int id = dept.getId();
            String deptName = dept.getName();

            System.out.println(
                    "Thông tin account thứ " + id + " là:\n"
                            + "Id: " + id + "\n"
                            + "Name: " + deptName
            );
        }
    }

//    Question 12:
//    Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
    public static void question_1_12() {
        for (int i = 0; i < departments.size(); i++) {
            if (i == 2) {
                break; // chỉ lấy 2 department đầu
            }

            Department dept = departments.get(i);

            System.out.println(
                    "Thông tin department thứ " + dept.getId() + " là:\n"
                            + "Id: " + dept.getId() + "\n"
                            + "Name: " + dept.getName()
            );
        }
    }


//    Question 13:
//    In ra thông tin tất cả các account ngoại trừ account thứ 2
    public static void question_1_13() {
        for (int i = 0; i < accounts.size(); i++) {
            if (i == 1) {
                continue; // bỏ qua account thứ 2
            }

            Account acc = accounts.get(i);

            String department = (acc.getDepartment() != null)
                    ? acc.getDepartment().getName()
                    : "Chưa có";

            System.out.println(
                    "Thông tin account thứ " + acc.getId() + " là:\n"
                            + "Email: " + acc.getEmail() + "\n"
                            + "Full name: " + acc.getFullName() + "\n"
                            + "Phòng ban: " + department
            );
        }
    }


//    Question 14:
//    In ra thông tin tất cả các account có id < 4
    public static void question_1_14() {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);

            if (acc.getId() >= 4) {
                continue;
            }

            System.out.println(
                    "Thông tin account thứ " + acc.getId() + " là:\n"
                            + "Email: " + acc.getEmail() + "\n"
                            + "Full name: " + acc.getFullName()
            );
        }
    }


//    Question 15:
//    In ra các số chẵn nhỏ hơn hoặc bằng 20
    public static void question_1_15() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }


//    WHILE
//    Question 16:
//    Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
//    lệnh break, continue
    public static void question_1_16() {
        int i = 0;
        while (i < accounts.size()) {
            if (i == 1) {
                i++;
                continue;
            }

            Account acc = accounts.get(i);

            System.out.println(
                    "Thông tin account thứ " + acc.getId() + " là:\n"
                            + "Email: " + acc.getEmail() + "\n"
                            + "Full name: " + acc.getFullName()
            );

            i++;
        }
    }


//    DO-WHILE
//    Question 17:
//    Làm lại các Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
//    lệnh break, continue
    public static void question_1_17() {
        int i = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 20);
    }



    //    Exercise 2: System out printf
    //    Question 1:
    //    Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
    //    nguyên đó
    public static void question_2_1() {
        int number = 5;
        System.out.printf("Số nguyên là: %d%n", number);

    }

    //    Question 2:
//    Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
//    ra số nguyên đó thành định dạng như sau: 100,000,000
    public static void question_2_2() {
        int number = 100_000_000;
        System.out.printf("Số nguyên: %,d%n", number);
    }

//    Question 3:
//    Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
//    thực đó chỉ bao gồm 4 số đằng sau
    public static void question_2_3() {
        double number = 5.567098;
        System.out.printf("Số thực: %.4f%n", number);
    }

    //    Question 4:
//    Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
//    dạng như sau:
//    Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
//    Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
    public static void question_2_4() {
        String fullName = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.%n", fullName);
    }

    //            Question 5:
    //    Lấy thời gian bây giờ và in ra theo định dạng sau:
    //            24/04/2020 11h:16p:20s
    public static void question_2_5() {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH'h':mm'm':ss's'");
        System.out.println(sdf.format(now));
    }

    //    Question 6:
    //    In ra thông tin account (như Question 8 phần FOREACH) theo định dạng
    //    table (giống trong Database)
    public static void question_2_6() {
        for (Account acc : accounts) {
            int id = acc.getId();
            String email = acc.getEmail();
            String fullName = acc.getFullName();
            String department = (acc.getDepartment() == null)
                    ? "Chưa có"
                    : acc.getDepartment().getName();

            System.out.printf(
                    "Thông tin account thứ %d là:%n" +
                            "Email: %s%n" +
                            "Full name: %s%n" +
                            "Phòng ban: %s%n",
                    id, email, fullName, department
            );
        }
    }

    //    Exercise 3: Date Format
//    Question 1:
//    In ra thông tin Exam thứ 1 và property create date sẽ được format theo định
//    dạng vietnamese
    public static void question_3_1() {
        Date now = new Date();
        SimpleDateFormat vnFormater = new SimpleDateFormat("dd/MM/yyyy ");
        System.out.println(vnFormater.format(now));
    }

    //    Question 2:
//    In ra thông tin: Exam đã tạo ngày nào theo định dạng
//    Năm – tháng – ngày – giờ – phút – giây
    public static void question_3_2() {
        SimpleDateFormat fullFormat =
                new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(fullFormat.format(exam1.getCreateDate()));
    }

    //    Question 3:
//    Chỉ in ra năm của create date property trong Question 2
    public static void question_3_3() {
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        System.out.println(yearFormat.format(exam1.getCreateDate()));
    }

    //    Question 4:
//    Chỉ in ra tháng và năm của create date property trong Question 2
    public static void question_3_4() {
        SimpleDateFormat monthYearFormat = new SimpleDateFormat("MM-yyyy");
        System.out.println(monthYearFormat.format(monthYearFormat));
    }

    //    Question 5:
//    Chỉ in ra "MM-DD" của create date trong Question 2
    public static void question_3_5() {
        SimpleDateFormat dayMonthFormater = new SimpleDateFormat("dd-MM");
        System.out.println(dayMonthFormater.format(dayMonthFormater));
    }

    //    Exercise 4: Random Number
//    Question 1:
//    In ngẫu nhiên ra 1 số nguyên
    public static void question_4_1() {
        Random random = new Random();

        System.out.println(random.nextInt());
    }

    //    Question 2:
//    In ngẫu nhiên ra 1 số thực
    public static void question_4_2() {
        Random random = new Random();
        System.out.println(random.nextDouble());
    }

    //
//    Question 3:
//    Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn
    public static void question_4_3() {
        Random random = new Random();
        String[] names = {"An", "Bình", "Cường", "Dũng"};
        System.out.println(names[random.nextInt(names.length)]);
    }

    //    Question 4:
//    Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12- 1995
    public static void question_4_4() {
        Random random = new Random();

        long start_day  = LocalDate.of(1995, 7, 24).toEpochDay();
        long end_day  = LocalDate.of(1995, 12, 20).toEpochDay();

        long randomDay = start_day + random.nextInt((int) (end_day - start_day) + 1);

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);

        System.out.println(randomDate);
    }
//    Question 5:
//    Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
    public static void question_4_5(){
        Random random = new Random();
        System.out.println(LocalDate.now().minusDays(random.nextInt(365)));
    }

//    Question 6:
//    Lấy ngẫu nhiên 1 ngày trong quá khứ.
    public static void question_4_6(){
        Random random = new Random();
        System.out.println(LocalDate.now().minusDays(random.nextInt(10000)));
    }

//    Question 7:
//    Lấy ngẫu nhiên 1 số có 3 chữ số.
    public static void question_4_7(){
        Random random = new Random();
        System.out.println(100 + random.nextInt(900));
    }

//    Exercise 5: Input from console
//    Question 1:
//    Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình.
    public static void question_5_1(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

    }

//    Question 2:
//    Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình.
    public static void question_5_2(){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        sc.close();
    }

//    Question 3:
//    Viết lệnh cho phép người dùng nhập họ và tên.
    public static void question_5_3(){
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String fullName = sc.nextLine();
        sc.close();
    }

//    Question 4:
//    Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ.
    public static void question_5_4(){
        Scanner sc = new Scanner(System.in);
        String dateStr = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date birthday = sdf.parse(dateStr);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        sc.close();
    }

//            Question 5:
//    Viết lệnh cho phép người dùng tạo account (viết thành method)
//    Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//    chương trình sẽ chuyển thành Position.Dev, Position.Test, Position.ScrumMaster, Position.PM.
    public static Account question_5_5(){
        Scanner sc = new Scanner(System.in);
        Account acc = new Account();

        acc.setUsername(sc.nextLine());

        int choice = sc.nextInt();

        acc.setPosition(positions.get(choice - 1));

        sc.close();
        return acc;

    }

//            Question 6:
//    Viết lệnh cho phép người dùng tạo department (viết thành method)

    public static Department question_5_6() {
        Scanner sc = new Scanner(System.in);
        Department dep = new Department();
        dep.setName(sc.nextLine());
        return dep;
    }

//    Question 7:
//    Nhập số chẵn từ console
    public static void question_5_7(){
        Scanner sc = new Scanner(System.in);

        int number;
        do {
            number = sc.nextInt();
        } while (number % 2 != 0);
    }
//    Question 8:
//    Viết chương trình thực hiện theo flow sau:
//    Bước 1:
//    Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
//    Bước 2:
//    Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//    Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo
//            department
//    Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập
//    lại" và quay trở lại bước 1


//    Question 9:
//    Viết method cho phép người dùng thêm group vào account theo flow sau:
//    Bước 1: In ra tên các usernames của user cho người dùng xem
//    Bước 2: Yêu cầu người dùng nhập vào username của account
//    Bước 3: In ra tên các group cho người dùng xem
//    Bước 4: Yêu cầu người dùng nhập vào tên của group
//    Bước 5: Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account        vào group đó .

//    Question 10: Tiếp tục Question 8 và Question 9
//    Bổ sung thêm vào bước 2 của Question 8 như sau:
//    Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
//            account
//    Bổ sung thêm Bước 3 của Question 8 như sau:
//    Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng text để hỏi   người dùng "Bạn có muốn thực hiện chức năng khác không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để kết thúc chương trình).


//    Question 11: Tiếp tục Question 10
//    Bổ sung thêm vào bước 2 của Question 8 như sau:
//    Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
//    Bước 1: In ra tên các usernames của user cho người dùng xem
//    Bước 2: Yêu cầu người dùng nhập vào username của account
//    Bước 3: Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
//    Bước 4: Thêm account vào group chương trình vừa chọn ngẫu nhiên

    public static void question_5_8To11(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Tạo account");
            System.out.println("2. Tạo department");
            System.out.println("3. Add group");
            System.out.println("4. Add random group");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: createAccount(); break;
                case 2: createDepartment(); break;
                case 3: addGroupToAccount(); break;
                case 4: addRandomGroup(); break;
                default:
                    System.out.println("Mời nhập lại");
                    continue;
            }

            System.out.println("Bạn có muốn tiếp tục không? (Y/N)");
            if (!sc.next().equalsIgnoreCase("Y")) {
                return;
            }
        }
    }
    public static Account createAccount() {
        Scanner sc = new Scanner(System.in);

        Account acc = new Account();

        System.out.println("Nhập username:");
        String username = sc.nextLine();
        acc.setUsername(username);

        System.out.println("Nhập email:");
        String email = sc.nextLine();
        acc.setEmail(email);

        System.out.println("Nhập full name:");
        String fullName = sc.nextLine();
        acc.setFullName(fullName);

        System.out.println("Chọn position:");
        System.out.println("1. DEV");
        System.out.println("2. TEST");
        System.out.println("3. SCRUM_MASTER");
        System.out.println("4. PM");

        int choice = sc.nextInt();

        Position pos = new Position();

        acc.setPosition(pos);
        accounts.add(acc);
        System.out.println("Tạo account thành công!");

        sc.close();

        return acc;
    }

    public static Department createDepartment() {
        Scanner sc = new Scanner(System.in);

        Department dept = new Department();
        System.out.println("Nhập tên department:");
        String name = sc.nextLine();
        dept.setName(name);

        departments.add(dept);
        System.out.println(" Tạo department thành công!");
        sc.close();
        return dept;
    }

    public static void addGroupToAccount() {
        Scanner sc = new Scanner(System.in);

        // Bước 1: In usernames
        System.out.println("Danh sách account:");
        for (Account acc : accounts) {
            System.out.println("- " + acc.getUserName());
        }

        // Bước 2: Nhập username
        System.out.println("Nhập username:");
        String username = sc.nextLine();

        Account selectedAcc = null;
        for (Account acc : accounts) {
            if (acc.getUserName().equals(username)) {
                selectedAcc = acc;
                break;
            }
        }

        if (selectedAcc == null) {
            System.out.println("Không tìm thấy account");
            return;
        }

        // Bước 3: In group
        System.out.println("Danh sách group:");
        for (Group g : groups) {
            System.out.println("- " + g.getName());
        }

        // Bước 4: Nhập group
        System.out.println("Nhập tên group:");
        String groupName = sc.nextLine();

        Group selectedGroup = null;
        for (Group g : groups) {
            if (g.getName().equals(groupName)) {
                selectedGroup = g;
                break;
            }
        }

        if (selectedGroup == null) {
            System.out.println("Không tìm thấy group");
            return;
        }

        GroupAccount ga = new GroupAccount(selectedGroup, selectedAcc, LocalDate.now().minusDays(15));

        groupAccounts.add(ga);

        System.out.println("Thêm account vào group thành công!");
        sc.close();

    }

    public static void addRandomGroup() {
        Scanner sc = new Scanner(System.in);

        // Bước 1: In usernames
        System.out.println("Danh sách account:");
        for (Account acc : accounts) {
            System.out.println("- " + acc.getUserName());
        }

        // Bước 2: Nhập username
        System.out.println("Nhập username:");
        String username = sc.nextLine();

        Account selectedAcc = null;
        for (Account acc : accounts) {
            if (acc.getUserName().equals(username)) {
                selectedAcc = acc;
                break;
            }
        }

        if (selectedAcc == null) {
            System.out.println("Không tìm thấy account");
            return;
        }

        // Bước 3: Random group
        Random random = new Random();
        Group randomGroup = groups.get(random.nextInt(groups.size()));

        GroupAccount ga = new GroupAccount(randomGroup, selectedAcc, LocalDate.now().minusDays(15) );

        // Bước 4: Add
        groupAccounts.add(ga);

        System.out.println("👉 Account đã được thêm vào group ngẫu nhiên: "
                + randomGroup.getName());
        sc.close();
    }



//    Exercise 6: Method
//    Question 1:
//    Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
    public static void question_6_1(){
        for (int i = 2; i < 10; i += 2)
            System.out.println(i);
    }

//    Question 2:
//    Tạo method để in thông tin các account
    public static void question_6_2(List<Account> accounts) {
        for (Account acc : accounts) {
            System.out.println(acc.getEmail());
        }
    }

//    Question 3:
//    Tạo method để in ra các số nguyên dương nhỏ hơn 10
    public static void question_6_3() {
        for (int i = 1; i < 10; i++)
            System.out.println(i);
    }




    static void initData() {

        // ===== DEPARTMENT =====
        depSale = new Department(1, "Sale");
        depMarketing = new Department(2, "Marketing");
        depIT = new Department(3, "IT");
//        departments = new Department[]{depSale, depMarketing, depIT};
        departments = new ArrayList<>(
          Arrays.asList(depSale, depMarketing, depIT)
        );

        // ===== POSITION =====
        posDev = new Position(1, PositionName.DEV);
        posTest = new Position(2, PositionName.TEST);
        posScrum = new Position(3, PositionName.SCRUM_MASTER);
        posPM = new Position(4, PositionName.PM);
//        positions = new Position[]{posDev, posTest, posScrum, posPM};
        positions = new ArrayList<>(
               Arrays.asList( posDev, posTest, posScrum, posPM)
        );

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

//        Account accounts = new ArrayList<>{acc1, acc2, acc3, acc4

        accounts = new ArrayList<>(
                Arrays.asList(acc1,acc2,acc3,acc4)
        );



        // ===== GROUP =====
        groupJava = new Group(1, "Java Fresher", acc1, LocalDate.now().minusDays(30));
        groupCSharp = new Group(2, "C# Fresher", acc1, LocalDate.now().minusDays(25));
        groupBackend = new Group(3, "Backend Team", acc3, LocalDate.now().minusDays(20));
        groupFrontend = new Group(4, "Frontend Team", acc4, LocalDate.now().minusDays(15));
        groups = new ArrayList<>(
                Arrays.asList(groupJava, groupCSharp, groupBackend, groupFrontend)
        );

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

//        groupAccounts = new GroupAccount[]{
//                ga1, ga2, ga3,
//                ga4, ga5,
//                ga6, ga7, ga8, ga9
//        };

        groupAccounts = new ArrayList<>(
                Arrays.asList(ga1, ga2, ga3,
               ga4, ga5,
               ga6, ga7, ga8, ga9)
        );

        // ===== CATEGORY QUESTION =====
        cateJava = new CategoryQuestion(1, "Java");
        cateSQL = new CategoryQuestion(2, "SQL");

//        categories = new CategoryQuestion[]{cateJava, cateSQL};

        categories = new ArrayList<>(
            Arrays.asList(cateJava, cateSQL)
        );

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

//        exams = new Exam[]{exam1, exam2};
        exams = new ArrayList<>(
                Arrays.asList(exam1, exam2)
        );
    }
}







