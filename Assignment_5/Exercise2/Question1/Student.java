package Assignment_5.Exercise2.Question1;

public class Student implements IStudent{
    private int id;

    private String name;

    private int group;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }


    public Student() {
    }

    public void setId(int id) {
        this.id = id;
    }


    public Student(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    @Override
    public void diemDanh() {
        System.out.println(this.name + " điểm danh");
    }

    @Override
    public void hocBai() {
        System.out.println(this.name + " đang học bài");
    }

    @Override
    public void diDonVeSinh() {
        System.out.println(this.name + " đang dọn vệ sinh");
    }
}
