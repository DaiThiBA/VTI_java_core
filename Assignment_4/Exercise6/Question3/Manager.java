package Assignment_4.Exercise6.Question3;

import Assignment_4.Exercise6.Question2.User;

public class Manager extends User {
    @Override
    public double calculatePay() {
        return getSalary_ratio()*520;
    }

    @Override
    public void displayInfor() {
        System.out.println("Manager" + super.toString());
    }
}
