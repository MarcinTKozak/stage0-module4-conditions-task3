package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {

        double money = 0;

        if (salary <= 10000) {
            money = salary - (salary * 0.15);
        }
        if (salary <= 20000) {
            money = salary - (salary * 0.18);
        }
        if (salary > 20000) {
            money = salary - (salary * 0.20);
        }
        if (salary < 0) {
            System.out.println("wrong input!");
        }
    }
}
