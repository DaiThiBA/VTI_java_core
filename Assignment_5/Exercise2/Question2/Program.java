package Assignment_5.Exercise2.Question2;

public class Program {
    public static void main(String[] args) {
        Student st = new Student();

        st.inputInfo();
        System.out.println("\n=== Thông tin sinh viên ===");
        st.showInfo();

        if (st.isScholarship()) {
            System.out.println("Sinh viên được học bổng");
        } else {
            System.out.println("Sinh viên không được học bổng");
        }
    }
}

