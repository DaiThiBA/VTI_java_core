package Assignment_4.Exercise2And3.com.vti.backend;

public class Exercise3 {
    //    Exercise 3: Boxing & Unboxing
//    Question 1:
//    Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//    Sau đó convert lương ra float và hiển thị lương lên màn hình (với số float có 2 số sau dấu thập phân).
    public void question_3_1() {
        Integer luong = 5000;
        float salaryFloat = (float) luong;

        System.out.printf("%.2f%n", salaryFloat);
    }
//    Question 2:
//    Khai báo 1 String có value = "1234567"
//    Hãy convert String đó ra số int

    public void question_3_2(){
        String value = "1234567";
        int intValue = Integer.parseInt(value);

        System.out.println(intValue);
    }
    //
//    Question 3:
//    Khởi tạo 1 số Integer có value là chữ "1234567"
//    Sau đó convert số trên thành datatype int
    public void question_3_3(){
        // ? đề ?
        Integer value = Integer.parseInt("1234567");
        int valueInt = value;
        System.out.println(valueInt);

    }
}
