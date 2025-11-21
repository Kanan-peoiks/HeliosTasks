package lesson17.classtask.task3;

public class Main {

    private static final Object metbexQapisi = new Object();
    private static final Object sifarisKitabcasi = new Object();

    public static void main(String[] args) {

    Thread aspaz = new Thread(() -> {
        System.out.println("Aşpaz: Mətbəxə girmək üçün qapını kilidləyir...");
        synchronized (metbexQapisi){
            System.out.println("→ Aşpaz qapını tutdu (1-ci resurs əlindədir)");

            try{ Thread.sleep(1000); } catch (InterruptedException e){
                Thread.currentThread().interrupt();}
            System.out.println("Aşpaz: İndi sifariş kitabçasını istəyir...");
            synchronized (sifarisKitabcasi){
                System.out.println("→ Aşpaz kitabçanı da aldı, yeməyi hazırlayır...");
            }
        }
    }, "Aspaz");

        Thread ofsiant = new Thread(() -> {
            System.out.println("Ofisiant: Müştəridən sifariş yazmaq üçün kitabçanı götürür...");
            synchronized (metbexQapisi){
                System.out.println("→ Ofisiant kitabçanı tutdu (1-ci resurs əlindədir)");

                try{ Thread.sleep(1000); } catch (InterruptedException e){
                    Thread.currentThread().interrupt();}
                System.out.println("Ofisiant: İndi yeməyi mətbəxə aparmaq üçün qapını açmaq istəyir...");
                synchronized (sifarisKitabcasi){
                    System.out.println("→ Ofisiant qapını açdı, yeməyi gətirir...");
                }
            }
        }, "ofsiant");

        aspaz.start();
        try { Thread.sleep(200); } catch (InterruptedException e) {}
        ofsiant.start();

        try {
            Thread.sleep(10000);
            System.out.println("5 saniyə keçdi... Heç bir irəliləyiş yoxdur → DEADLOCK yarandı!");
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }





    }
}
