package Assignment_4.Exercise6.Question2;

public abstract class User {
    private String name;

    private double salary_ratio;

    public User() {
    }

    public User(String name, double salary_ratio) {
        this.name = name;
        this.salary_ratio = salary_ratio;
    }

    public double getSalary_ratio() {
        return salary_ratio;
    }

    public void setSalary_ratio(double salary_ratio) {
        this.salary_ratio = salary_ratio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double calculatePay();

    public abstract void displayInfor();

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", salary_ratio=" + salary_ratio +
                '}';
    }
}
