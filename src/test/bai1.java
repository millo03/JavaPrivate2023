package test;

import com.sun.tools.jconsole.JConsoleContext;

public class bai1 {
    public static void main(String[] args) {
        // float 10 pt random
        double[] a = new double[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random() * 100;
        }
        // hiển thị
        for (double x : a) {
            System.out.printf("%.5f  ", x);
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%.5f  ", a[i]);
        }
        System.out.println();
        int n = 0;
        do {
            System.out.printf("%.5f  ", a[n]);
            n = n + 1;
        } while (n < a.length);
    }
}
