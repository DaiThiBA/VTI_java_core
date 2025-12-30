package Assignment_5.Exercise1.Question2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ITuyenSinh tuyenSinh = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n===== TUYỂN SINH =====");
            System.out.println("1. Thêm mới thí sinh");
            System.out.println("2. Hiển thị danh sách thí sinh");
            System.out.println("3. Tìm kiếm theo số báo danh");
            System.out.println("4. Thoát");
            System.out.print("Chọn: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Số báo danh: ");
                    String sbd = sc.nextLine();

                    System.out.print("Họ tên: ");
                    String ten = sc.nextLine();

                    System.out.print("Địa chỉ: ");
                    String diaChi = sc.nextLine();

                    System.out.print("Mức ưu tiên: ");
                    int uuTien = Integer.parseInt(sc.nextLine());

                    System.out.print("Chọn khối (A/B/C): ");
                    String khoi = sc.nextLine().toUpperCase();

                    ThiSinh ts = null;
                    if (khoi.equals("A")) {
                        ts = new ThiSinhKhoiA(sbd, ten, diaChi, uuTien);
                    } else if (khoi.equals("B")) {
                        ts = new ThiSinhKhoiB(sbd, ten, diaChi, uuTien);
                    } else if (khoi.equals("C")) {
                        ts = new ThiSinhKhoiC(sbd, ten, diaChi, uuTien);
                    }

                    if (ts != null) {
                        tuyenSinh.themThiSinh(ts);
                        System.out.println("Thêm thành công!");
                    }
                    break;

                case 2:
                    tuyenSinh.hienThiThiSinh();
                    break;

                case 3:
                    System.out.print("Nhập SBD cần tìm: ");
                    String search = sc.nextLine();
                    ThiSinh found = tuyenSinh.timTheoSoBaoDanh(search);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Không tìm thấy!");
                    }
                    break;

                case 4:
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

