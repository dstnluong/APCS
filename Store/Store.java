import java.util.*;
public class Store {
    ArrayList <Item> inventory;
    public Store() {
        inventory = new ArrayList<Item>();
    }
    public void displayCheapItems(double cost) {
        for(int i = 0; i < inventory.size(); i++){
            if(inventory.get(i).getprice() <= cost){
                System.out.println(inventory.get(i));
            }
        }
    }
    public void addItem(Item i){
        inventory.add(i);
    }
    public void sell(String name, int count){
        int counter = count;
        for(int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).getName().equals(name)){
                inventory.remove(i);
                i--;
                counter--;
            }
            if(counter == 0){
                break;
            }
        }
    }
    public int getInventoryCount(String name, String sku){
        int counter = 0;
        for(int i = 0; i < inventory.size(); i++){
            if(inventory.get(i).getName().equals(name)
                || inventory.get(i).getSKU().equals(sku)){
                counter++;
            }
        }
        return counter;
    }
    public void setDiscountPrice(String name, double price){
        for(int i = 0; i < inventory.size(); i++) {
            if(inventory.get(i).getName().equals(name)){
                inventory.get(i).changePrice(price); 
            }
        }
    }
    public void printInventory(){
        for(int i = 0; i < inventory.size();i++){
            System.out.println(inventory.get(i).getName());
        }
    }
}
