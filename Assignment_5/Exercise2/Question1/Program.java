package Assignment_5.Exercise2.Question1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        // a) Tạo 10 học sinh, chia 3 nhóm
        students.add(new Student(1, "Nam", 1));
        students.add(new Student(2, "Lan", 1));
        students.add(new Student(3, "Hùng", 1));

        students.add(new Student(4, "Mai", 2));
        students.add(new Student(5, "An", 2));
        students.add(new Student(6, "Tuấn", 2));

        students.add(new Student(7, "Hà", 3));
        students.add(new Student(8, "Minh", 3));
        students.add(new Student(9, "Trang", 3));
        students.add(new Student(10, "Phúc", 3));

        // b) Cả lớp điểm danh
        System.out.println("=== Cả lớp điểm danh ===");
        for (Student s : students) {
            s.diemDanh();
        }

        // c) Nhóm 1 học bài
        System.out.println("\n=== Nhóm 1 học bài ===");
        for (Student s : students) {
            if (s.getGroup() == 1) {
                s.hocBai();
            }
        }

        // d) Nhóm 2 dọn vệ sinh
        System.out.println("\n=== Nhóm 2 dọn vệ sinh ===");
        for (Student s : students) {
            if (s.getGroup() == 2) {
                s.diDonVeSinh();
            }
        }
    }
}
