package KiemTraLan1.Bai2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentServiceImpl service=new StudentServiceImpl();
        Student a=new Student();
        a.input();

        Student b= new Student();
         b.input();
        System.out.println( a.getId());
        System.out.println( b.getId());
    }
}
