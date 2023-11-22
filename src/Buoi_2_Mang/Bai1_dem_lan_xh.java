package Buoi_2_Mang;

import java.util.HashMap;
import java.util.Scanner;

public class Bai1_dem_lan_xh {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            // thêm vào map
            if (map.containsKey(a[i])) {
                int key = map.get(a[i]);// lấy giá trị hiện tại
                key++;
                map.put(a[i], key);
            } else {
                map.put(a[i], 1);
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println(); //1 2 2 3 3 3 4 4 4 4 5 5 5 5
        // biểu thức lamda
        map.forEach((keyInt, valueInt) -> System.out.println("Key = " + keyInt + ", value = " + valueInt));

    }
}
