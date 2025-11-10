package lesson6.oopTekrarMentorHome;

public class CarSystemMain {
    public static void main(String[] args) {
            Manufacturer mac1 = new Manufacturer("toyoto", 2005, "japon");
            Manufacturer mac2 = new Manufacturer("BMW", 2010, "Germany");

            Car car1= new Car("M6",mac2,2010,200,"BENZIN", 200000);
            Car car2 = new Car("Corello", mac1, 2005,190,"dizel",150000);
            Car car3 = new Car("F10", mac2, 2005,350, "hibrid", 500000);

        System.out.println(car1);
        System.out.println("---");
        System.out.println(car2);
        System.out.println("---");
        System.out.println(car3);System.out.println("---");

        System.out.println("Dizel:");
        if (car1.getFuelType().equalsIgnoreCase("dizel")){
            System.out.println(car1);
        } else if (car2.getFuelType().equalsIgnoreCase("dizel")) {
            System.out.println(car2);
        } else if (car3.getFuelType().equalsIgnoreCase("dizel")) {
            System.out.println(car3);
        }
        else {
            System.out.println("dizel yoxdur");
        }

        System.out.println(car1.getManufacturer().getCountry());
        System.out.println(car2.getManufacturer().getCountry());
        System.out.println(car3.getManufacturer().getCountry());

    }
}
