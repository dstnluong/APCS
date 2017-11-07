public class Item{
    private String name;
    private double price;
    private String sku;
    public Item(String n, double p, String s){
        name = n;
        price = p;
        sku = s;
    }
    public String getName(){
        return name;
    }
    public double getprice(){
        return price;
    }
    public String getSKU(){
        return sku;
    }
    public void changePrice(double p) {
        price = p;
    }
}

