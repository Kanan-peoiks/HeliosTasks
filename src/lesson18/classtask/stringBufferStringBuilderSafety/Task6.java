package lesson18.classtask.stringBufferStringBuilderSafety;

public class Task6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuffer sbuf = new StringBuffer();

        Multi th1 = new Multi(sb, sbuf, "A");
        Multi th2 = new Multi(sb, sbuf, "B");

        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println(sb.length());

        System.out.println(sbuf.length());



    }
}
