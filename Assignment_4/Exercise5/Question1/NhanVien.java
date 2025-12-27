package Assignment_4.Exercise5.Question1;

public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String hoTen, GioiTinhEnum gioiTinh, int tuoi, String diaChi) {
        super(hoTen, gioiTinh, tuoi,diaChi);
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString() + "NhanVien{" +
                "congViec='" + congViec + '\'' +
                '}';
    }
}
