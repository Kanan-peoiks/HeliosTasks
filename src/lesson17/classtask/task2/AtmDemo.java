package lesson17.classtask.task2;

class AtmDemo implements Runnable {
private Atm atm;
private String name;

    public AtmDemo(Atm atm, String name) {
        this.atm = atm;
        this.name = name;
    }

@Override
    public void run(){
        atm.useAtm(name);
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        atm.leaveAtm(name);
}




}
