package Assignment_4.Exercise5.Question4;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        QuanLySach qls = new QuanLySach();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== QUẢN LÝ THƯ VIỆN =====");
            System.out.println("1. Thêm sách");
            System.out.println("2. Thêm tạp chí");
            System.out.println("3. Thêm báo");
            System.out.println("4. Xóa theo mã");
            System.out.println("5. Hiển thị tất cả");
            System.out.println("6. Tìm theo loại");
            System.out.println("7. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    qls.themTaiLieu(new Sach("S1", "NXB Giáo Dục", 100, "Nguyễn Văn A", 300));
                    break;

                case 2:
                    qls.themTaiLieu(new TapChi("TC1", "NXB Trẻ", 50, 12, 9));
                    break;

                case 3:
                    qls.themTaiLieu(new Bao("B1", "NXB Lao Động", 200, "01/10/2025"));
                    break;

                case 4:
                    System.out.print("Nhập mã cần xóa: ");
                    qls.xoaTheoMa(sc.nextLine());
                    break;

                case 5:
                    qls.hienThi();
                    break;

                case 6:
                    System.out.println("1. Sách | 2. Tạp chí | 3. Báo");
                    int type = Integer.parseInt(sc.nextLine());
                    if (type == 1) qls.timTheoLoai(Sach.class);
                    else if (type == 2) qls.timTheoLoai(TapChi.class);
                    else if (type == 3) qls.timTheoLoai(Bao.class);
                    break;

                case 7:
                    running = false;
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Chọn sai!");
            }
        }
        sc.close();
    }
}

