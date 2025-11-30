package lesson20.smartEmailFilter;

public class Email {
    String content;
    boolean isSpam;

    public Email(String content, boolean isSpam) {
        this.content = content;
        this.isSpam = isSpam;
    }

    public String getContent() {
        return content;
    }

    public boolean isSpam(){
        return isSpam;
    }
}
