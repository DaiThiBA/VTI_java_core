package Assignment_4.Exercise1;

public class Department {
    private int id;
    private String name;

    //Question 1:
    //Tạo constructor cho department:
    //a) Không có parameters
    public Department(){

    }
    //b) Có 1 parameter là nameDepartment và default id của Department = 0
    //Khởi tạo 1 Object với mỗi constructor ở trên
    public Department(String name) {
        this.id = 0;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}




