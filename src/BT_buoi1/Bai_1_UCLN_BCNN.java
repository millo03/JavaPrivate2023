package BT_buoi1;

import java.util.Scanner;

public class Bai_1_UCLN_BCNN {
    public  static  int UCLN(int a, int b){
        if(b == 0 ) return a;
        else return  UCLN(b,a%b);
    }
    public  static  int UCLNcua3so(int a, int b,int c){
        return UCLN(UCLN(a,b),c);
    }

    public static int BCNN(int a, int b, int c){
        // tìm bội chung lớn nhất của 2 só a,b, nhân với phép chia hết cả c với UCLN a,b
        // UCLN a,b
        int d = UCLN(a,b);
        // BCNN(a,b)
        int e = a*b/d;
        // BCNH3 số
        return e * c/UCLNcua3so(a,b,c);

    }
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.print("a= ");
        a= sc.nextInt();
        System.out.print("b= ");
        b= sc.nextInt();
        System.out.print("c= ");
        c= sc.nextInt();
        // tìm ra ước chung max cảu a và b rồi tim tiếp vs c
        System.out.println("Ước chung lớn nhát: "+ UCLNcua3so(a,b,c));
        System.out.println("Bội chung nhỏ nhát: "+ BCNN(a,b,c));

    }
}
