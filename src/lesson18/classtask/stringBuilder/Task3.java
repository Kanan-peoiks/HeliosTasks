package lesson18.classtask.stringBuilder;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Çörək, ");
        sb.append("Süd, ");
        sb.append("Yumurta, ");
        sb.append("Pendirdir, ");
        sb.append("Bal");

        String [] sbSplit;

        sbSplit = sb.toString().split(", ");

        String maxUzunluq = sbSplit[0];
        int uzunluq = sbSplit[0].length();

        for (int i = 0; i < sbSplit.length; i++) {
        if (sbSplit[i].length()>uzunluq){
            maxUzunluq = sbSplit[i];
            uzunluq = sbSplit[i].length();
        }
        }
        System.out.println(maxUzunluq);

    }
}
