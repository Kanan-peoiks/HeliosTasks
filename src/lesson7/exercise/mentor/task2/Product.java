package lesson7.exercise.mentor.task2;

public abstract class Product {
    String name;
    double price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    abstract void displayInfo();

    void applyDiscount(double percent){
          price = price - (price * percent / 100);
        System.out.println(price);
    }


}
