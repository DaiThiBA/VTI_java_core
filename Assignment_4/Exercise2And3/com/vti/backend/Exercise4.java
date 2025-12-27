package Assignment_4.Exercise2And3.com.vti.backend;

import Done.Assignment_1.Question_1.Group;
import Done.Assignment_3.Department;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise4 {
    //    Exercise 4: String
//    Question 1:
//    Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng );

    public void question_4_1(){
        Scanner sc = new Scanner(System.in);

        String[] arrString = sc.nextLine().trim().split("\\s+");

        System.out.println(arrString.length);
        sc.close();
    }
    //    Question 2:
//    Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    public void question_4_2(){
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
    public void question_4_3(){
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
    public void question_4_4(){
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

    public void question_4_5(){
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

    public void question_4_6(){
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
    public void question_4_7(){
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
    public void init(){
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
    public void question_4_8(){
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
    public void question_4_9(){
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

    public boolean  question_4_10(String a , String b){
        Scanner sc = new Scanner(System.in);

        String b_reversed = new StringBuffer(b).reverse().toString();

        return (a.equals(b_reversed));
    }
    //    Question 11: Count special Character
//    Tìm số lần xuất hiện ký tự "a" trong chuỗi
    public int question_4_11(String ten){
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
    public String question_4_12(String word){
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

    public boolean question_4_13(String word){
        if(word == null){
            return false;
        }
        else return !word.matches(".*\\d.*");
    }
    //    Question 14: Replace character
//    Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
//    Ví dụ:
//            "VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
    public String question_4_14(String word, String wantToReplace,String replacement){
        return word.replaceAll(wantToReplace,replacement);
    }

    //    Question 15: Revert string by word
//    Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
//    Ví dụ: " I am developer " => "developer am I".
//    Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//    Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt chuỗi theo dấu cách
    public String question_4_15(String word){
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
    public void question_4_16(String word, int n){
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
}
