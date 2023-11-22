package Buoi5.BtTrenLop;

public class Teacher1 extends Preson1{
    private int salary;

    public Teacher1(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public Teacher1() {
        super();
        this.salary = 0;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void output() {
        super.output();
        System.out.printf("%-15d\n",salary);
    }
}
