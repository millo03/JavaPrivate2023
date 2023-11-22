package BT_buoi1;

import java.util.Scanner;

public class Bai_2_Chuyen_co_so {
    // đổi 10->2
    public static void he2(int x) {
        if (x != 0) {
            he2(x / 2);
            System.out.print(x % 2);
        }
    }

    public static void he8(int x) {
        if (x != 0) {
            he8(x / 8);
            System.out.print(x % 8);
        }
    }

    public static void he16(int x) {
        if (x != 0) {
            he8(x / 16);
            if (x % 16 < 10) System.out.print(x % 16);
            else if (x % 16 == 10) System.out.print('A');
            else if (x % 16 == 11) System.out.print('B');
            else if (x % 16 == 12) System.out.print('C');
            else if (x % 16 == 13) System.out.print('D');
            else if (x % 16 == 14) System.out.print('E');
            else if (x % 16 == 15) System.out.print('F');
        }
    }

    public static void chon(int key) {
        if (key == 2) ;
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("Chuyển đổi hệ số : ");
        int k = sc.nextInt();
        while (k > 16 || k < 2) {
            System.out.print("Nhập lại hệ số : ");
            k = sc.nextInt();
        }

        if (k == 2) he2(55);
        else if (k == 6) he8(254);
        else if (k == 16) he16(26);
        else System.out.println("Hê số này ko được sd");

    }
}
