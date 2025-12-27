package Assignment_4.Exercise4.Question1;

public class Student {
    //Tạo Object Student có các property id, name, hometown, điểm học lực
    //a) Tất cả các property sẽ để là private để các class khác không chỉnh sửa hay nhìn thấy
    private int id;
    private String name;
    private String hometown;
    private float diemHocLuc;

    //b) Tạo constructor cho phép khi khởi tạo mỗi student
    // thì người dùng sẽ nhập vào tên, hometown và có điểm học lực = 0

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.diemHocLuc = 0;
    }
    //c) Tạo 1 method cho phép set điểm vào
    public void setDiemHocLuc(float diemHocLuc) {
        this.diemHocLuc = diemHocLuc;
    }
    //d) Tạo 1 method cho phép cộng thêm điểm
    public void addDiemHocLuc(float diemCong){
        this.diemHocLuc += diemCong;
    }

    //e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên,
    // điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu,
    // nếu điểm > 4.0 và < 6.0 thì sẽ in ra là trung bình,
    // nếu điểm > 6.0 và < 8.0 thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi).
    //Demo các chức năng trên bằng class ở front-end.
    private String xepLoaiHocLuc(){
        if (this.diemHocLuc < 4.0){
            return "Yếu";
        } else if(this.diemHocLuc >=4 && this.diemHocLuc < 6.0){
            return "Trung bình";
        } else if (this.diemHocLuc >=6 && this.diemHocLuc < 8.0){
            return "Khá";
        } else {
            return "Giỏi";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                ", tên: '" + name + '\'' +
                ", diemHocLuc: " + diemHocLuc +
                ", hocLuc: " + xepLoaiHocLuc() +
                '}';
    }
}


//Exercise 4 : Encapsulation
//Question 1:



