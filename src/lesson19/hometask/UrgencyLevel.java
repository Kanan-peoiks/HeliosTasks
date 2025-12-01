package lesson19.hometask;

public enum UrgencyLevel {
    ROUTINE("RUTIN TASK"),
    NORMAL("NORMAL TASK"),
    URGENT("ONEMLI TASK");

    String desc;

    UrgencyLevel(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }


}
