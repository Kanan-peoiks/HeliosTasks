package lesson7.exercise.irsiyyet;

public class Labrador extends Dog{
    public Labrador(int age, String furColor, String name, String runDistance, int legLength, int ownerCount, String adress) {
        super(age, furColor, name, runDistance, legLength);
        this.ownerCount = ownerCount;
        this.adress = adress;
    }

    @Override
            boolean canHunt (){return false;}
            //EGER VALIDEYNDEN BIR DEYERI ALIB DEYISIRIKSE O OVERRIDE ILE

    int ownerCount;
            String adress;

            void dailyActivities (){
                System.out.println("playing at home");
            }

    @Override
    public String toString() {
        return "Labrador{" +
                "ownerCount=" + ownerCount +
                ", adress='" + adress + '\'' +
                ", runDistance='" + runDistance + '\'' +
                ", legLength=" + legLength +
                ", age=" + age +
                ", furColor='" + furColor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
