package BT_buoi1;

import java.util.Scanner;

public class Bai_4_phep_co_ban_2_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // xử lý dấu cộng
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.println("a+b = " + (a + b));
        System.out.println("a-b = " + (a - b));
        System.out.println("a*b = " + (a * b));
        if (b != 0) {
            System.out.println("a : b = " + (1.0 * a / b));
        }
    }
}
