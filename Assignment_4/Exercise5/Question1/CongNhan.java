package Assignment_4.Exercise5.Question1;

public class CongNhan extends CanBo{
    private BacEnum bac;

    public CongNhan() {

    }

    public CongNhan(String hoTen, GioiTinhEnum gioiTinh, int tuoi, String diaChi, BacEnum bac) {
        super(hoTen, gioiTinh, tuoi, diaChi);
        this.bac = bac;
    }

    public BacEnum getBac() {
        return bac;
    }

    public void setBac(BacEnum bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + "CongNhan{" +
                "bac=" + bac +
                '}';
    }
}
