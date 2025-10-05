package lesson6.homework;

import lesson6.task2.Product;

public class Clothing extends Product {
    String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        System.out.println("Clothing: " + name + " | Size: " + size + " | Price: $" + price);

    }
}
