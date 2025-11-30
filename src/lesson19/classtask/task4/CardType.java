package lesson19.classtask.task4;

public enum CardType {
    DEBIT(10, "Gündəlik istifadə üçündür"),
    CREDIT(20, "Kredit limiti var"),
    VIRTUAL(0, "Onlayn ödəniş üçündür"),
    PREMIUM(50,"Xüsusi cashback və xidmət paketi var");

    int xidmetHaqqi;
    String tesvir;

    CardType(int xidmetHaqqi, String tesvir) {
        this.xidmetHaqqi = xidmetHaqqi;
        this.tesvir = tesvir;
    }

    public int getXidmetHaqqi() {
        return xidmetHaqqi;
    }

    public String getTesvir() {
        return tesvir;
    }

    public static void printCardInfo(CardType type){
        switch (type){
            case DEBIT, CREDIT, VIRTUAL, PREMIUM:
                System.out.println(type + ": "+type.getTesvir() + " odenis: "+type.getXidmetHaqqi());
                break;
            default:
                System.out.println("bele secim yoxdur.");
                break;
        }
    }
}
