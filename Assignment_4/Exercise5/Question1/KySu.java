package Assignment_4.Exercise5.Question1;

public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String hoTen, GioiTinhEnum gioiTinh, int tuoi,String diaChi) {
        super(hoTen, gioiTinh, tuoi,diaChi);
    }

    public KySu() {
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString() + "KySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}
