package Buoi_3_OOP.Bai_tap_tren_lop;

//format ctrl Alt L
public class Account {
    private int id;
    private String name;
    private int balance;

    public Account() {
        id = 0;
        name = "";
        balance = 0;
    }

    public Account(Integer id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {// rút
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("So du ko du de rut");
        }

    }

    public void display() {
        System.out.println("id: " + id + "    Name: " + name + "      Balance: " + balance);
    }

}
