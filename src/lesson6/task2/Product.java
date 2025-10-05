package lesson6.task2;

public abstract class Product {
    public String name;
    public double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayInfo(); // abstract, body yoxdur

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }




}

