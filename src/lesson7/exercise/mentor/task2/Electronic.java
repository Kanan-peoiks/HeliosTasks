package lesson7.exercise.mentor.task2;

public class Electronic extends Product {
    String brand;

    public Electronic(String name, int price, String brand) {
        super(name, price);
        this.brand = brand;
    }



    @Override
    void displayInfo() {
        System.out.println("brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price );
    }


}
