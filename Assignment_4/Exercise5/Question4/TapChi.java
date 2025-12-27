package Assignment_4.Exercise5.Question4;

public class TapChi extends TaiLieu {
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String ma, String nxb, int soBan, int soPhatHanh, int thangPhatHanh) {
        super(ma, nxb, soBan);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TẠP CHÍ | " + super.toString() +
                ", Số PH: " + soPhatHanh +
                ", Tháng: " + thangPhatHanh;
    }
}

