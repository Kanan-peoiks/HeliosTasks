package lesson18.classtask.stringBuilder;

public class Task2 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Çörək, ");
        sb.append("Süd, ");
        sb.append("Yumurta, ");
        sb.append("Pendirdir");

        System.out.println(sb);


        sb.delete(26,29);
        sb.delete(0,6);


        System.out.println(sb);


    }
}
