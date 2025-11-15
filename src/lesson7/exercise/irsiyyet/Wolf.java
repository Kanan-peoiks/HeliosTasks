package lesson7.exercise.irsiyyet;

public class Wolf {

    int age;
    String furColor;
    String name;


    final boolean canBreathe(){return true;}
    boolean canHunt (){return true;}

    public Wolf(int age, String furColor, String name) {
        this.age = age;
        this.furColor = furColor;
        this.name = name;
    }
}
