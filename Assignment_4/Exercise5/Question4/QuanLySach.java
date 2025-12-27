package Assignment_4.Exercise5.Question4;

import java.util.ArrayList;
import java.util.List;

public class QuanLySach {
    private List<TaiLieu> danhSach = new ArrayList<>();

    // a) Thêm
    public void themTaiLieu(TaiLieu tl) {
        danhSach.add(tl);
    }

    // b) Xóa theo mã
    public void xoaTheoMa(String ma) {
        danhSach.removeIf(tl -> tl.getMaTaiLieu().equalsIgnoreCase(ma));
    }

    // c) Hiển thị
    public void hienThi() {
        danhSach.forEach(System.out::println);
    }

    // d) Tìm theo loại
    public void timTheoLoai(Class<?> loai) {
        for (TaiLieu tl : danhSach) {
            if (loai.isInstance(tl)) {
                System.out.println(tl);
            }
        }
    }
}
