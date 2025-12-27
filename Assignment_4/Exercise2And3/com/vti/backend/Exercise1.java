package Assignment_4.Exercise2And3.com.vti.backend;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    //Exercise 1: Datatype Casting
    //Question 1:
    //Khai báo 2 số lương có kiểu dữ liệu là float. v
    //Khởi tạo Lương của Account 1 là 5240.5 $ v
    //Khởi tạo Lương của Account 2 là 10970.055$ v
    //Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
    //Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
    public void question_1_1() {

        float salary1 = 5240.5f;

        float salary2 = 10970.055f;

        int salaryOfAccount1TypeInt = (int) salary1;

        int salaryOfAccount12TypeInt = (int) salary2;

        System.out.println(salaryOfAccount1TypeInt);

        System.out.println(salaryOfAccount12TypeInt);

    }

    //Question 2:
//Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm có số 0 ở đầu cho đủ 5 chữ số)
    public String question_1_2() {
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

    public void question_1_3() {
        int number = Integer.parseInt(question_1_2());

        System.out.println(number % 100);
    }

    //Question 4:
    //Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng.
    public float question_1_4() {
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

}

