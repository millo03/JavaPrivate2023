package Buoi_4;

import java.util.Date;

public class Catagory {
    private static  String ten;
    private static Date namSinh;

    public static String getTen() {
        return ten;
    }

    public static Date getNamSinh() {
        return namSinh;
    }

    public static void setTen(String ten) {
        Catagory.ten = ten;
    }

    public static void setNamSinh(Date namSing) {
        Catagory.namSinh = namSing;
    }

    public Catagory() {
        ten = "";
    }
}
