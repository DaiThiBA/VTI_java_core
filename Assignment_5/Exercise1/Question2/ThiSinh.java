package Assignment_5.Exercise1.Question2;

public abstract class ThiSinh {
    protected String soBaoDanh;
    protected String hoTen;
    protected String diaChi;
    protected int mucUuTien;

    public ThiSinh(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
    }

    public String getSoBaoDanh() {
        return soBaoDanh;
    }

    public abstract String getKhoi();

    @Override
    public String toString() {
        return "SBD: " + soBaoDanh +
                ", Họ tên: " + hoTen +
                ", Địa chỉ: " + diaChi +
                ", Ưu tiên: " + mucUuTien +
                ", Khối: " + getKhoi();
    }
}

