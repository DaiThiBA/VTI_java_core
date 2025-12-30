package Assignment_5.Exercise2.Question2;

import java.util.Scanner;

public class Student extends Person {
    private String studentId;
    private float avgScore;
    private String email;

    // Constructor
    public Student() {
    }

    public Student(String name, String gender, String birthDate, String address,
                   String studentId, float avgScore, String email) {
        super(name, gender, birthDate, address);
        this.studentId = studentId;
        this.avgScore = avgScore;
        this.email = email;
    }

    // a) Override inputInfo
    @Override
    public void inputInfo() {
        super.inputInfo(); // nhập phần Person

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã sinh viên: ");
        studentId = sc.nextLine();

        System.out.print("Nhập điểm trung bình: ");
        avgScore = Float.parseFloat(sc.nextLine());

        System.out.print("Nhập email: ");
        email = sc.nextLine();
    }

    // b) Override showInfo
    @Override
    public void showInfo() {
        super.showInfo(); // in phần Person
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Điểm trung bình: " + avgScore);
        System.out.println("Email: " + email);
    }

    // c) Xét học bổng
    public boolean isScholarship() {
        return avgScore >= 8.0;
    }
}

