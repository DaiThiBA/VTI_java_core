package Assignment_4.Exercise5.Question3;

public class HighSchoolStudent extends Student{
    private String clazz;
    private String desiredUniversity;


    public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity ) {
        super(name, id);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }


    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "HighSchoolStudent{" +
                "clazz='" + clazz + '\'' +
                ", desiredUniversity='" + desiredUniversity + '\'' +
                '}';
    }
}
