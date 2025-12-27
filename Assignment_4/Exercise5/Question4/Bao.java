package Assignment_4.Exercise5.Question4;

public class Bao extends TaiLieu {
    private String ngayPhatHanh;

    public Bao(String ma, String nxb, int soBan, String ngayPhatHanh) {
        super(ma, nxb, soBan);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "BÁO | " + super.toString() +
                ", Ngày PH: " + ngayPhatHanh;
    }
}

