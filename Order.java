import java.util.ArrayList;

public class Order {

    // MEMBER VARIABLES
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    // CONSTRUCTOR
    public Order() {
        this.name = "Guest";
        ArrayList<Item> items = new ArrayList<Item>();
    }

    // OVERLOADED CONSTRUCTOR
    public Order(String name) {
        this.name = name;
        ArrayList<Item> myList = new ArrayList<Item>();
    }

    // GETTERS & SETTERS
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getReady() {
        return this.ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }

    // ORDER METHODS
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage(){
        if(this.ready == true) {
            return "Your order is ready!";
        } 
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    // REFERENCED LEARN PLATFORM FOR LINES 62-68
    public double getOrderTotal() {
        double sum = 0;
        for(Item item: this.items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        // REFERENCED LEARN PLATFORM FOR LINES 72-74
        for(Item item: this.items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

}