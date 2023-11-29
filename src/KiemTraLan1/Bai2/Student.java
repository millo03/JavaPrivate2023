package KiemTraLan1.Bai2;

import java.util.Scanner;

public class Student extends Person{
    private  double score;


    public Student(String name, short age,Address address, double score) {
        super(name, age,address);
        this.score = score;
    }

    public Student() {
        this.score = 0;
    }

    public Student(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.println("Nhap diem:");
        score=sc.nextDouble();
        sc.nextLine();
    }
    public static void inTieuDe(){
        System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s\n","ID","Name","Age","Address","Score","Capacity");
    }

    @Override
    public String getCapacity() {
        if(score >= 9) return "Xuất sắc";
        else if(score>= 8) return "Giỏi";
        else if(score >= 6.5) return "Khá";
        else return "Trung bình yếu";
    }

    @Override
    public String toString() {
        return String.format("%-10d%-20s%-20d%-20s%-20.2f%-20s",getId(),getName(),getAge(),getAddress().toString(),getScore(),getCapacity());
    }
}
