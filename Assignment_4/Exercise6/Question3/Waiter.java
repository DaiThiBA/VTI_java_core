package Assignment_4.Exercise6.Question3;

import Assignment_4.Exercise6.Question2.User;

public class Waiter extends User {
    @Override
    public double calculatePay() {
        return getSalary_ratio()*220;
    }

    @Override
    public void displayInfor() {
        System.out.println("Waiter" + super.toString());
    }
}
