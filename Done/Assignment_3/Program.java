package Done.Assignment_3;

import Done.Assignment_1.Question_1.Account;
import Done.Assignment_1.Question_1.Group;

import java.time.LocalDate;
import java.util.*;

public class Program {
    public static void main(String[] args) {
        //question_1_1();
        //question_1_2();
        //question_1_3();
        //System.out.println(question_1_4());
        //question_2_1();
        //question_3_1();
        //question_3_2();
        //question_3_3();
        //question_4_1();
        //question_4_2();
        //question_4_3();
        //question_4_4();
        //question_4_6();
        //question_4_8();
        //question_4_9();
        //System.out.println(question_4_10("word", "drow") );
        //System.out.println(question_4_11("Quang Dai Thiaa"));
        //System.out.println(question_4_12("word"));
        //System.out.println(question_4_13("abc"));
        //System.out.println(question_4_14("VTI Academy", "e", "*"));
        //System.out.println(question_4_15(" I am developer "));
        //question_4_16("abcdefg",2);
        //question_5_1();
        //question_5_2();
//        System.out.println(question_5_5());
//        question_5_6();

    }

    //Exercise 1: Datatype Casting
    //Question 1:
    //Khai báo 2 số lương có kiểu dữ liệu là float. v
    //Khởi tạo Lương của Account 1 là 5240.5 $ v
    //Khởi tạo Lương của Account 2 là 10970.055$ v
    //Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
    //Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
    public static void question_1_1() {

        float salary1 = 5240.5f;

        float salary2 = 10970.055f;

        int salaryOfAccount1TypeInt = (int) salary1;

        int salaryOfAccount12TypeInt = (int) salary2;

        System.out.println(salaryOfAccount1TypeInt);

        System.out.println(salaryOfAccount12TypeInt);

    }

    //Question 2:
//Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)
    public static String question_1_2() {
        Random random = new Random();

        int randomNumber = random.nextInt(10000);

        String fiveDigitFormat = String.format("%05d", randomNumber);
        System.out.println(fiveDigitFormat);
        return fiveDigitFormat;
    }

//Question 3:
//Lấy 2 số cuối của số ở Question 2 và in ra.
//Gợi ý:
//Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//Cách 2: chia lấy dư số đó cho 100

    public static void question_1_3() {
        int number = Integer.parseInt(question_1_2());

        System.out.println(number % 100);
    }

    //Question 4:
    //Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng.
    public static float question_1_4() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            return (float) a / b;
        } catch (ArithmeticException e) {
            throw e;
        } finally {
            sc.close();
        }

    }

    //    Exercise 2: Default value
//    Question 1:
//    Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//            • Email: "Email 1"
//            • Username: "User name 1"
//            • FullName: "Full name 1"
//            • CreateDate: now
    public static Account[] question_2_1() {
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

    //    Exercise 3: Boxing & Unboxing
//    Question 1:
//    Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//    Sau đó convert lương ra float và hiển thị lương lên màn hình (với số float có 2 số sau dấu thập phân).
    public static void question_3_1() {
        Integer luong = 5000;
        float salaryFloat = (float) luong;

        System.out.printf("%.2f%n", salaryFloat);
    }
//    Question 2:
//    Khai báo 1 String có value = "1234567"
//    Hãy convert String đó ra số int

    public static void question_3_2(){
        String value = "1234567";
        int intValue = Integer.parseInt(value);

        System.out.println(intValue);
    }
    //
//    Question 3:
//    Khởi tạo 1 số Integer có value là chữ "1234567"
//    Sau đó convert số trên thành datatype int
    public static void question_3_3(){
        // ? đề ?
        Integer value = Integer.parseInt("1234567");
        int valueInt = value;
        System.out.println(valueInt);

    }
//    Exercise 4: String
//    Question 1:
//    Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng );

    public static void question_4_1(){
        Scanner sc = new Scanner(System.in);

        String[] arrString = sc.nextLine().trim().split("\\s+");

        System.out.println(arrString.length);
        sc.close();
    }
//    Question 2:
//    Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    public static void question_4_2(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 =  sc.nextLine();

        s1 += s2;

        System.out.println(s1);

        sc.close();
    }
//    Question 3:
//    Viết chương trình để người dùng nhập vào tên và kiểm tra,
//    nếu tên chữ (Chưa?) viết hoa chữ cái đầu thì viết hoa lên.
    public static void question_4_3(){
        Scanner sc = new Scanner(System.in);

        String ten = sc.nextLine().trim();
        String[] arrString =ten.split("\\s+");
        for (int i = 0; i <= arrString.length -1; i++){
            char kiTuDau = arrString[i].charAt(0);

            if(!Character.isUpperCase(kiTuDau)){
                String phanConLai = arrString[i].substring(1);
                arrString[i] = Character.toUpperCase(kiTuDau)
                        + phanConLai;
            }
        }
        System.out.println(String.join(" ", arrString));
        sc.close();

    }
//            Question 4:
//    Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
//    VD:
//    Người dùng nhập vào "Nam", hệ thống sẽ in ra
//        "Ký tự thứ 1 là: N"
//                "Ký tự thứ 1 là: A"
//                "Ký tự thứ 1 là: M"
    public static void question_4_4(){
        Scanner sc = new Scanner(System.in);
        String ten =  sc.nextLine();
        String tenKhongKhoangTrang =ten.replaceAll("\\s+","");

        int i = 0;
        for (char kiTu : tenKhongKhoangTrang.toCharArray()){
            System.out.println("Kí tự thứ " + (i+1) + " là :"+ kiTu);
            i++;
        }
        sc.close();
    }
//    Question 5:
//    Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ.

    public static void question_4_5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Họ");
        String ho =  sc.nextLine();
        System.out.println("Nhập Tên");
        String ten =  sc.nextLine();
        System.out.println(ho + " " + ten);

        sc.close();
    }
//    Question 6:
//    Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//    VD:
//    Người dùng nhập vào "Nguyễn Văn Nam"
//    Hệ thống sẽ in ra
//    "Họ là: Nguyễn"
//            "Tên đệm là: Văn"
//            "Tên là: Nam"

    public static void question_4_6(){
        Scanner sc = new Scanner(System.in);
        String[] hoTen = new String[3];
        System.out.println("Nhập Họ");
        hoTen[0] =  sc.nextLine();
        System.out.println("Nhập Tên Đệm");
        hoTen[1] =  sc.nextLine();
        System.out.println("Nhập Tên");
        hoTen[2] = sc.nextLine();

        System.out.println(
                "Họ là: " + hoTen[0] +"\n"
                + "Tên đệm là: " + hoTen[1] + "\n"
                + "Tên là: " + hoTen[2]
        );
    }
//    Question 7:
//    Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên của họ như sau:
//    a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn   nam"
//    b) Viết hoa chữ cái mỗi từ của người dùng
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"
    public static void question_4_7(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập họ tên");
        String ten = sc.nextLine().trim();
        String[] arrString =ten.split("\\s+");
        for (int i = 0; i <= arrString.length -1; i++){
            char kiTuDau = arrString[i].charAt(0);

            if(!Character.isUpperCase(kiTuDau)){
                String phanConLai = arrString[i].substring(1);
                arrString[i] = Character.toUpperCase(kiTuDau)
                        + phanConLai;
            }
        }
        System.out.println(String.join(" ", arrString));
        sc.close();
    }


    static Group groupJava;
    static Group groupCSharp;
    static Group groupBackend;
    static Group groupFrontend;
    static List<Group> groups;
    static Department depSale;
    static Department depMarketing;
    static Department depIT;
    static List<Department> departments;
    public static void init(){
        // ===== GROUP =====
        groupJava = new Group(1, "Java Fresher", null, LocalDate.now().minusDays(30));
        groupCSharp = new Group(2, "C# Fresher", null, LocalDate.now().minusDays(25));
        groupBackend = new Group(3, "Java Junior", null, LocalDate.now().minusDays(20));
        groupFrontend = new Group(4, "Java", null, LocalDate.now().minusDays(15));
        groups = new ArrayList<>(
                Arrays.asList(groupJava, groupCSharp, groupBackend, groupFrontend)
        );
        // ===== DEPARTMENT =====
        depSale = new Department(1, "Sale");
        depSale.setAddress("Test Address");
        depMarketing = new Department(2, "Marketing");
        depIT = new Department(3, "IT");
        departments = new ArrayList<>(
                Arrays.asList(depSale, depMarketing, depIT)
        );
    }

    //    Question 8:
    //    In ra tất cả các group có chứa chữ "Java"
    public static void question_4_8(){
        init();
        for (Group group : groups){
            String tenGroup = group.getName();
            if(tenGroup.toLowerCase().contains("java")){
                System.out.println(
                        "Mã group: " + group.getId() + "\n"
                         + "Tên group: " + tenGroup
                );
            }
        }
    }

//    Question 9:
//    In ra tất cả các group "Java"
    public static void question_4_9(){
        init();
        for (Group group : groups){
            String tenGroup = group.getName();
            if(tenGroup.toLowerCase().equals("java")){
                System.out.println(
                        "Mã group: " + group.getId() + "\n"
                                + "Tên group: " + tenGroup
                );
            }
        }
    }
//    Question 10:
//    Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//    Nếu có xuất ra “OK” ngược lại “KO”.
//    Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.

    public static boolean  question_4_10(String a , String b){
        Scanner sc = new Scanner(System.in);

        String b_reversed = new StringBuffer(b).reverse().toString();

        return (a.equals(b_reversed));
    }
//    Question 11: Count special Character
//    Tìm số lần xuất hiện ký tự "a" trong chuỗi
    public static int question_4_11(String ten){
        String tenKhongKhoangTrang =ten.replaceAll("\\s+","");

        int count = 0;
        for (char kiTu : tenKhongKhoangTrang.toCharArray()){
            if (kiTu == 'a'){
                count++;
            }
        }
        return count;
    }

//    Question 12: Reverse String
//    Đảo ngược chuỗi sử dụng vòng lặp
    public static String question_4_12(String word){
        String reversed = "";
        char[] word_arrays = word.toCharArray();
        for(int i = word.length() -1 ; i >= 0 ;i --){
            reversed = reversed + word_arrays[i];
        }
        return reversed;
    }
//    Question 13:
//    String not contains digit
//    Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
//    Ví dụ:
//            "abc" => true
//            "1abc", "abc1", "123", "a1bc", null => false

    public static boolean question_4_13(String word){
        if(word == null){
            return false;
        }
        else return !word.matches(".*\\d.*");
    }
//    Question 14: Replace character
//    Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
//    Ví dụ:
//            "VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
    public static String question_4_14(String word, String wantToReplace,String replacement){
        return word.replaceAll(wantToReplace,replacement);
    }

//    Question 15: Revert string by word
//    Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
//    Ví dụ: " I am developer " => "developer am I".
//    Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//    Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt chuỗi theo dấu cách
    public static String question_4_15(String word){
        String[] arrString =word.trim().split("\\s+");
        String[] reversedByWord = new String[arrString.length];
        int ir = 0;
        for (int i = arrString.length -1; i >= 0; i--){
            reversedByWord[ir] = arrString[i];
            ir++;
        }
        return String.join(" ", reversedByWord);
    }
//    Question 16:
//    Cho một chuỗi str và số nguyên n >= 0.
//    Chia chuỗi str ra làm các phần bằng nhau với n ký tự.
//    Nếu chuỗi không chia được thì xuất ra màn hình “KO”.
    public static void question_4_16(String word, int n){
        if (word == null || n <= 0){
            System.out.println("KO");
        } else {
            int length = word.length();
            if (length % n != 0){// có dư không -> có dư -> không chia được
                System.out.println("KO");
            } else {
                int soPhan = length/n;
                int indx = 0;
                String[] chiaPhanTu = new String[soPhan];
                for(int i = 0; i <= length -1 ; i +=n){
                    int endIndex = i + n;
                    chiaPhanTu[indx] = word.substring(i,endIndex);
                    System.out.println(chiaPhanTu[indx]);
                    indx++;
                }
            }
        }

    }
//    Exercise 5: Object’s Method
//    Question 1:
//    In ra thông tin của phòng ban thứ 1 (sử dụng toString())

    public static void question_5_1(){
        init();
        System.out.println(depSale);
    }

//    Question 2:
//    In ra thông tin của tất cả phòng ban (sử dụng toString())
    public static void question_5_2(){
        init();
        for( Department dept : departments){
            System.out.println(dept);
        }
    }
//    Question 3:
//    In ra địa chỉ của phòng ban thứ 1
    public static void question_5_3(){
        init();
        System.out.println(depSale.getAddress());
    }
//    Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
    public static boolean question_5_4(){
        init();
        return depSale.getName().equals("Phòng A");
    }
//    Question 5:
//    So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
    public static boolean question_5_5(){
        init();
        return depSale.equals(depMarketing); // đã override equals
    }
//    Question 6:
//    Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//    VD:
//    Accounting
//    Boss of director
//            Marketing
//    Sale
//    Waiting room
    public static void question_5_6(){
        init();
        Collections.sort(departments,
                Comparator.comparing(Department::getName) );
        for( Department dept : departments ){
            System.out.println(dept);
        }
    }
//    Question 7:
//    Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra dan sách phòng ban được sắp xếp theo tên
//    VD:
//    Accounting
//    Boss of director
//            Marketing
//    waiting room
//    Sale
public static void question_5_7(){
    init();
    Collections.sort(departments,
            Comparator.comparing(Department::getName) );
    for( Department dept : departments ){
        System.out.println(dept);
    }
}

}



