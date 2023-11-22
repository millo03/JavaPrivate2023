package Buoi_3_OOP.Bai_tap;

public class Vegetable {
    private String _id;
    private String _name;
    private String _unit;
    private int _quantitySold;
    private int _sale;
    private double _price;

    // getter
    public String get_id() {
        return _id;
    }

    public String get_name() {
        return _name;
    }

    public String get_unit() {
        return _unit;
    }

    public int get_sale() {
        return _sale;
    }

    public int get_quantitySold() {
        return _quantitySold;
    }

    public double get_price() {
        return _price;
    }

    //setter
    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_unit(String _unit) {
        this._unit = _unit;
    }

    public void set_quantitySold(int _quantitySold) {
        this._quantitySold = _quantitySold;
    }

    public void set_sale(int _sale) {
        this._sale = _sale;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    // id auto
    public static int id = 0;

    // constructor
    public Vegetable() {
        id = id + 1;
        _id = "V00" + String.valueOf(id);// chuyển từ số sang string có 2 cách Integer.toString()
        // Chuyển từ String sang int:  Integer.parseInt() ;
        _name = "";
        _unit = "";
        _quantitySold = 0;
        _sale = 0;
        _price = 0.0;
    }

    public Vegetable(String _name, String _unit, int _quantitySold, int _sale, double _price) {

        id = id + 1;
        _id = "V00" + String.valueOf(id);
        this._name = _name;
        this._unit = _unit;
        this._quantitySold = _quantitySold;
        this._sale = _sale;
        this._price = _price;
    }

    public double getTotalRevenue() {
        return _quantitySold * (_price - (_price * _sale / 100));
    }

    public void dislay() {
        System.out.printf("%-5s %-25s %-15s %-20d %-15d %-15g %-15g\n", _id, _name, _unit, _quantitySold, _sale, _price, getTotalRevenue());
    }

}




















