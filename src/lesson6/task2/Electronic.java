package lesson6.task2;

public class Electronic extends Product{
    String brand;

    public Electronic(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }
    @Override
    public void displayInfo() {
        System.out.println("Electronic: " + name + " | Brand: " + brand + " | Price: $" + price);
    }
}
