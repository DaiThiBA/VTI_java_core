package Assignment_4.Exercise5.Question1;

public abstract class CanBo {
    private String hoTen;

    private int tuoi;

    private GioiTinhEnum gioiTinh;

    private String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, GioiTinhEnum gioiTinh, int tuoi, String diaChi) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public GioiTinhEnum getGioiTinh() {
        return gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(GioiTinhEnum gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh=" + gioiTinh +
                '}';
    }
}
