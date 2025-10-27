package lesson12.task1;

    public class Task1 {
        public static void main(String[] args) {

            Storage<Phone> phoneStorage = new Storage<>();
            phoneStorage.set(new Phone("iphone17", 17, 17.1, true));
            System.out.println(phoneStorage.get());



            Storage<Food> foodStorage = new Storage<>();
            foodStorage.set(new Food("pizza"));
            System.out.println(foodStorage.get());







//            Storage<Integer> intStorage = new Storage<>();
//            intStorage.set(6);
//            System.out.println(intStorage.get());
//
//
//            Storage<Double> dbStorage = new Storage<>();
//            dbStorage.set(6.2);
//            System.out.println(dbStorage.get());
//
//
//            Storage<Boolean> boolStorage = new Storage<>();
//            boolStorage.set(true);
//            System.out.println(boolStorage.get());
        }
    }
