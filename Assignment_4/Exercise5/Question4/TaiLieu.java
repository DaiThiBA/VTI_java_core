package Assignment_4.Exercise5.Question4;

public abstract class TaiLieu {
    protected String maTaiLieu;
    protected String nhaXuatBan;
    protected int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    @Override
    public String toString() {
        return "Mã: " + maTaiLieu +
                ", NXB: " + nhaXuatBan +
                ", Số bản: " + soBanPhatHanh;
    }
}

