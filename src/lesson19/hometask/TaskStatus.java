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


}
