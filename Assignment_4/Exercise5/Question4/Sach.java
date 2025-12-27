package Assignment_4.Exercise5.Question4;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private int soTrang;

    public Sach(String ma, String nxb, int soBan, String tenTacGia, int soTrang) {
        super(ma, nxb, soBan);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "SÁCH | " + super.toString() +
                ", Tác giả: " + tenTacGia +
                ", Số trang: " + soTrang;
    }
}

