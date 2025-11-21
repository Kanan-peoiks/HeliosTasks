package lesson18.classtask;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Sizlə görüşmək istərdim");
        sb.insert(23, " Hörmətlə, Məktub");
        sb.insert(0, "Hörmətli Oxucu, ");


        System.out.println(sb);
    }
}
