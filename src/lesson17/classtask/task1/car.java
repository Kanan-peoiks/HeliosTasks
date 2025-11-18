package lesson17.classtask.task1;

class car implements Runnable{
    private Parking parking;
    private String name;

    public car(Parking parking, String name) {
        this.parking = parking;
        this.name = name;
    }

    @Override
    public void run(){
        parking.park(name);

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        parking.leave(name);
    }









}
