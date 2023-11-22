package Buoi5.BTVN.Bai2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Bill {
    private String symbols;// kí hiệu
    private int id;
    private Date date;
    private PersontBuy buy;
    private Person2 purchase;

    public Bill(String symbols, int id, Date date) {
        this.symbols = symbols;
        this.id = id;
        this.date = date;
    }

    public Bill() {
        this.symbols = "";
        this.id=0;
        this.date =new Date();
    }

    public void input(Scanner sc){
        System.out.print("symbols: ");
        symbols = sc.nextLine();
        System.out.print("id: ");
        id = sc.nextInt();
       date = new Date();// lầy time hiện tại
        // fomat date
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(date);
        System.out.println(formattedDate);


    }

    public static void main(String[] args) {
        Bill a = new Bill();
        Scanner sc = new Scanner(System.in);
        //a.input(sc);
        Date b = new Date();
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
       String formattedDate = formatter.format(b);
        System.out.println(formattedDate);
    }

}
