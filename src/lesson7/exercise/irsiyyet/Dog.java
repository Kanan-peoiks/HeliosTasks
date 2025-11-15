package lesson7.exercise.irsiyyet;

public class Dog extends Wolf {

    public Dog(int age, String furColor, String name, String runDistance, int legLength) {
        super(age, furColor, name);
        this.runDistance = runDistance;
        this.legLength = legLength;
    }

    String runDistance;
    int legLength;

//    @Override
//    boolean canBreathe(){return false;} //BUNUN QARSINI ALMAQ UCUN FINAL-DAN ISTIFADE OLUNUR

    void loyal(){
        System.out.println("I am loyal");
    }


}
