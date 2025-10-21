package lesson7.homework;

import lesson7.task2.Product;

public class Technology extends Product {
    int warrantyPeriod;;

    public Technology(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayInfo() {
        System.out.println("Technology: " + name + " | Warranty Period: " + warrantyPeriod + " | Price: $" + price);

    }
}
