package lesson19.hometask;

public enum TaskStatus {
    PENDING("GOZLENILIR..."),
    IN_PROGRESS("ICRA EDILIR..."),
    ON_HOLD("SAXLANILIR..."),
    COMPLETED("TAMAMLANDI..."),
    ARCHIVED("ARXIV EDILDI...");

    String description;

    TaskStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static void getTesvir(TaskStatus status){
        switch (status){
            case PENDING, IN_PROGRESS, ON_HOLD, COMPLETED, ARCHIVED:
                System.out.println(status + ": "+status.getDescription());
                break;
            default:
                System.out.println("Bele secim yoxdur.");
                break;
        }

    }
}
