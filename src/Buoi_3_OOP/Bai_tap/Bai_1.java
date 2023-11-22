package Buoi_3_OOP.Bai_tap;

import java.util.*;

public class Bai_1 {
    static List<Vegetable> listVege = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void title() {
        System.out.printf("%-5s %-25s %-15s %-20s %-15s %-15s %-15s\n", "ID", "Name", "Unit", "Quantity sold", "Sale", "Price", "Revenue");
    }

    public static void add() {

        String name;
        String unit;
        int quantity;
        int sales;
        double price;

        Vegetable a = new Vegetable();
        System.out.print("Name: ");
        sc.nextLine(); // Tiêu thụ ký tự xuống dòng trốn
        name = sc.nextLine();
        a.set_name(name);
        System.out.print("Unit: ");
        unit = sc.nextLine();
        a.set_unit(unit);
        System.out.print("Quantity sold: ");
        quantity = sc.nextInt();
        a.set_quantitySold(quantity);
        System.out.print("Sale: ");
        sales = sc.nextInt();
        a.set_sale(sales);
        while (sales > 100 || sales < 0) {
            System.out.print("Enter again sale: ");
            sales = sc.nextInt();
            a.set_sale(sales);
        }
        System.out.print("Price: ");
        price = sc.nextInt();
        a.set_price(price);
        listVege.add(a);
    }

    public static void display() {
        if (listVege.isEmpty()) System.out.println("List is Empty.");
        else {
            title();
            for (Vegetable a : listVege) {
                a.dislay();
            }
        }
    }

    public static void SortByRevenue() {
        if (listVege.isEmpty()) System.out.println("Can't sort list because It í Emtry");
        else {
            Collections.sort(listVege, (v1, v2) -> Double.compare(v1.getTotalRevenue(), v2.getTotalRevenue()));
            /*
             * sort thuộc Collections
             * so sánh ngược lại đổi cặp v1,v2 trong compare
             * */

            System.out.println("The list has been arranged");
        }
    }

    public static void SortByUnitGroup() {
        if (listVege.isEmpty()) System.out.println("Can't sort list because It í Emtry");
        else {
            //sắp sếp theo tăng dần của assci unit
            Collections.sort(listVege, (v1, v2) -> {
                int i = v1.get_unit().trim().compareToIgnoreCase(v2.get_unit().trim());

                return i;
            });
            System.out.println("The list has been arranged");
        }
    }


    public static int checkKey() {
        int key;
        System.out.print("Enter your choose: ");
        key = sc.nextInt();
        while (key <= 0 || key > 6) {
            System.out.print("Enter again your choose: ");
            key = sc.nextInt();
        }
        return key;
    }

    public static void main(String[] args) {
        System.out.println("1. Add new Vegetable");
        System.out.println("2. Display list");
        System.out.println("3. Sort by Revenue");
        System.out.println("4. Sort by vegetable group ");
        System.out.println("5. Search by name");
        System.out.println("6. Exit program");
        do {
            switch (checkKey()) {
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    SortByRevenue();
                    break;
                case 4:
                    SortByUnitGroup();
                    break;
                case 5:
                    return;
            }

        } while (true);


    }
}
