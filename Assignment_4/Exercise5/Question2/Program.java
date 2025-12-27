package Assignment_4.Exercise5.Question2;

import Assignment_4.Exercise5.Question1.BacEnum;
import Assignment_4.Exercise5.Question1.CanBo;
import Assignment_4.Exercise5.Question1.CongNhan;
import Assignment_4.Exercise5.Question1.GioiTinhEnum;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("===== QUẢN LÝ CÁN BỘ =====");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Xóa cán bộ theo tên");
            System.out.println("5. Thoát chương trình");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    CanBo cn = new CongNhan(
                            "Nguyễn Văn A",
                            GioiTinhEnum.NAM,
                            30,
                            "Hà nội",
                            BacEnum.BAC_5
                    );
                    qlcb.addCanBo(cn);
                    System.out.println("Đã thêm cán bộ!");
                    break;

                case 2:
                    System.out.print("Nhập tên cần tìm: ");
                    String nameSearch = sc.nextLine();
                    CanBo found = qlcb.searchByTen(nameSearch);
                    if (found != null) {
                        System.out.println(found);
                    }
                    break;

                case 3:
                    qlcb.infoDanhSachCanBo();
                    break;

                case 4:
                    System.out.print("Nhập tên cần xóa: ");
                    String nameDelete = sc.nextLine();
                    qlcb.deleteCanBo(nameDelete);
                    System.out.println("Đã xóa (nếu tồn tại).");
                    break;

                case 5:
                    System.out.println("Thoát chương trình!");
                    running = false;
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }

        sc.close();
    }
}
