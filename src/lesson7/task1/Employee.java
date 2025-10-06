package lesson7.task1;

public class Employee extends Person implements Workable,Trainable{
    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public void printInfo() {
        System.out.println("AD: " +name + " Yash: "+age);
    }
    @Override
    public void work(){
        System.out.println(name + " isleyir");
    }

    @Override
    public void attendTraining() {
        System.out.println(name + " train edilir");
    }
}
