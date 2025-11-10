package lesson6.oopTekrarMentorHome;

public class Car {
    private String model;
    private Manufacturer manufacturer;
    private int productionYear;
    private int engineSize;
    private String fuelType;
    private int price;

    public Car(String model, Manufacturer manufacturer, int productionYear, int engineSize, String fuelType, int price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.productionYear = productionYear;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", productionYear=" + productionYear +
                ", engineSize=" + engineSize +
                ", fuelType='" + fuelType + '\'' +
                ", price=" + price +
                '}';
    }

    public String getModel() {
        return model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getPrice() {
        return price;
    }
}
