package Assignment_4.Exercise5.Question2;

import Assignment_4.Exercise5.Question1.CanBo;
import Assignment_4.Exercise5.Question1.CongNhan;
import Assignment_4.Exercise5.Question1.KySu;
import Assignment_4.Exercise5.Question1.NhanVien;

import java.util.ArrayList;
import java.util.List;

public class QLCB {

    private List<CanBo> danhSachCanBo = new ArrayList<>();

    public void addCanBo(CanBo canBo){
        danhSachCanBo.add(canBo);
    }

    public CanBo searchByTen( String name){
        for (CanBo cb : danhSachCanBo) {
            if (cb.getHoTen().equalsIgnoreCase(name)) {
                return cb;
            }
        }
        System.out.println("Không tìm thấy cán bộ");
        return null;
    }

    public void infoDanhSachCanBo(){
        for (CanBo cb : danhSachCanBo) {
            System.out.println(cb);
        }
    }

    public void deleteCanBo(String name){
        danhSachCanBo.remove(
                searchByTen(name)
        );
    }




}
//Question 2: Tiếp tục Question 1
//Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:
//a) Thêm mới cán bộ.
//b) Tìm kiếm theo họ tên.
//        c) Hiện thị thông tin về danh sách các cán bộ.
//d) Nhập vào tên của cán bộ và delete cán bộ đó
//e) Thoát khỏi chương trình.

