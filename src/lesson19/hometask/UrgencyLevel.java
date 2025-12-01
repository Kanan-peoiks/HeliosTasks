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

    public static void getTesvir(UrgencyLevel level){
        switch (level){
            case ROUTINE, NORMAL, URGENT:
                System.out.println(level + ": "+level.getDesc());
                break;
            default:
                System.out.println("Bele secim yoxdur.");
                break;
        }

    }
}
