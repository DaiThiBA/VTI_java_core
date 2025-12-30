package Assignment_5.Exercise2.Question3;

public class Program {
    public static void main(String[] args) {

        System.out.println("=== Hình chữ nhật ===");
        HinhChuNhat hcn = new HinhChuNhat(4, 6);
        System.out.println("Chu vi: " + hcn.tinhChuVi());
        System.out.println("Diện tích: " + hcn.tinhDienTich());

        System.out.println("\n=== Hình vuông ===");
        HinhVuong hv = new HinhVuong(5);
        System.out.println("Chu vi: " + hv.tinhChuVi());
        System.out.println("Diện tích: " + hv.tinhDienTich());
    }
}

