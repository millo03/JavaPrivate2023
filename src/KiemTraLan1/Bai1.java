package KiemTraLan1;

import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = true;

        String string;
        System.out.print("Nhap chuỗi: ");
        string = sc.nextLine();
        char[] kitu = string.toCharArray();
        if (string.isEmpty()) b = false;
        else {
            int dem1 = 0, dem2 = 0, dem3 = 0;
            // trường hợp chuỗi liên tiếp
//            for (int j = 0; j <= kitu.length - 1; j++) {
//                //System.out.println("1    "+ i);
//                if ((kitu[j] == '(' && kitu[j + 1] == ')')) {
//                    dem1 = dem1 + 1;
//                } else if ((kitu[j] == '[' && kitu[j + 1] == ']')) {
//                    dem2 = dem2 + 1;
//                } else if ((kitu[j] == '{' && kitu[j + 1] == '}')) {
//                    dem3 = dem3 + 1;
//                } else if ((kitu[j] == '(' && kitu[j + 2] == ')')) {
//                    dem1 = dem1 + 1;
//                } else if ((kitu[j - 1] == '[' && kitu[j + 2] == ']')) {
//                    dem2 = dem2 + 1;
//                } else if ((kitu[j - 1] == '{' && kitu[j + 2] == '}')) {
//                    dem3 = dem3 + 1;
//                }
//            }
            for (int i = 0; i < kitu.length; i++) {
                //for(int j= 1; j<kitu.length-1;j++){
                if (kitu[i] == '(' || kitu[i ] == ')')  {
                    dem1 = dem1 + 1;
                } else if (kitu[i] == '[' || kitu[i] == ']') {
                    dem2 = dem2 + 1;
                } else if (kitu[i] == '{' || kitu[i] == '}') {
                    dem3 = dem3 + 1;
                }
            }
            //int t = dem1 + dem2 + dem3;
            System.out.println(dem1 * 2 + dem2 * 2 + dem3 * 2);
            if (dem1 %2 == 0&& dem2 %2 == 0 &&dem3 %2 == 0) {
                System.out.println("True");
                System.out.println("(): " + dem1/2);
                System.out.println("[]: " + dem2/2);
                System.out.println("{}: " + dem3/2);
            } else System.out.println("False");
        }

    }
}


