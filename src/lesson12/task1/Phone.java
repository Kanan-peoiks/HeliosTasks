package lesson12.task1;

public class Phone {
    private String model;
    private int intmodel;
    private double dbmodel;
    private boolean blmodel;


    public Phone (String model, int intmodel, double dbmodel, boolean blmodel){
        this.model = model;
        this.intmodel = intmodel;
        this.dbmodel = dbmodel;
        this.blmodel = blmodel;
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", intmodel=" + intmodel +
                ", dbmodel=" + dbmodel +
                ", blmodel=" + blmodel;
    }
}
