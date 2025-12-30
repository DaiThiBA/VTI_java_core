package Assignment_5.Exercise2.Question3;

public class HinhVuong extends HinhChuNhat {

    public HinhVuong(double canh) {
        super(canh, canh); // hình vuông là HCN có chiều dài = chiều rộng
    }

    @Override
    public double tinhChuVi() {
        System.out.println("Tính chu vi theo Hình Vuông");
        return super.tinhChuVi();
    }

    @Override
    public double tinhDienTich() {
        System.out.println("Tính diện tích theo Hình Vuông");
        return super.tinhDienTich();
    }
}