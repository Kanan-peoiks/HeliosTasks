package lesson18.classtask.stringBufferStringBuilderSafety;

public class Multi extends Thread {
    private StringBuffer sbuf;
    private StringBuilder sb;
    private String symbol;

    public Multi(StringBuilder sb, StringBuffer sbuf,  String symbol) {
        this.sbuf = sbuf;
        this.sb = sb;
        this.symbol = symbol;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100_000; i++) {
    sb.append(symbol);
    sbuf.append(symbol);
        }
    }
}