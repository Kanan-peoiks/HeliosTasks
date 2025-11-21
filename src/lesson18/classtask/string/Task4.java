package lesson18.classtask.string;

public class Task4 {
    public static void main(String[] args) {

        String str = " Iphone 16 Pro  ";

        System.out.println("Məhsul adı təmizləndi və böyük hərflərlə yazıldı:" + str.trim().toUpperCase());
        System.out.println("Məhsul adının uzunluğu: "+str.trim().toUpperCase().length());
        System.out.println("Məhsulun ilk hərfi: "+str.trim().toUpperCase().charAt(0));
        System.out.println("Məhsulun son hərfi: " + str.trim().toUpperCase().charAt(12));


    }
}
