import java.util.ArrayList;

public class TestOrders {
    public static void main(String[] args) {
        
        Item item1 = new Item("Drip Coffee", 2.0);
        Item item2 = new Item("Latte", 3.5);
        Item item3 = new Item("Mocha", 4.0);
        Item item4 = new Item("Cappuccino", 5.0);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("James");
        Order order4 = new Order("Bob");
        Order order5 = new Order("Matt");

        // TEST CASES
        order1.addItem(item1);
        order1.addItem(item2);
        order1.setReady(true); 
        System.out.println(order1.getStatusMessage());
        System.out.println(order1.getOrderTotal());
        order1.display();

        order2.addItem(item3);
        order2.addItem(item4);
        order2.setReady(true); 
        System.out.println(order2.getStatusMessage());
        System.out.println(order2.getOrderTotal());
        order2.display();

        order3.addItem(item2);
        order3.addItem(item2);
        order3.setReady(true); 
        System.out.println(order3.getStatusMessage());
        System.out.println(order3.getOrderTotal());
        order3.display();

        order4.addItem(item1);
        order4.addItem(item4);
        order4.setReady(false); 
        System.out.println(order4.getStatusMessage());
        System.out.println(order4.getOrderTotal());
        order4.display();

        order5.addItem(item2);
        order5.addItem(item3);
        order5.setReady(false); 
        System.out.println(order5.getStatusMessage());
        System.out.println(order5.getOrderTotal());
        order5.display();

    }
}