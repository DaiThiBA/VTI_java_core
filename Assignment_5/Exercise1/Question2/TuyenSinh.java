package Assignment_5.Exercise1.Question2;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh implements ITuyenSinh {

    private List<ThiSinh> danhSach = new ArrayList<>();

    @Override
    public void themThiSinh(ThiSinh thiSinh) {
        danhSach.add(thiSinh);
    }

    @Override
    public void hienThiThiSinh() {
        for (ThiSinh ts : danhSach) {
            System.out.println(ts);
        }
    }

    @Override
    public ThiSinh timTheoSoBaoDanh(String soBaoDanh) {
        for (ThiSinh ts : danhSach) {
            if (ts.getSoBaoDanh().equalsIgnoreCase(soBaoDanh)) {
                return ts;
            }
        }
        return null;
    }
}

