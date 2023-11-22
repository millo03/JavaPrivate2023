package BT_buoi1;

public class Bai_3_tich_cac_chu_so {
    public static int tich(int a) {
        if (a == 0) return 0;
        int ticha = 1;
        while (a != 0) {
            ticha *= a % 10;
            a = a / 10;
        }

        return ticha;
    }

    public static void main(String[] args) {
        System.out.println(tich(64226));
    }
}
