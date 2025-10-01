package lesson5;

public class StudentMain {
    public static void main(String[] args) {

        Student st1 = new Student("sen", 12, 134);
        Student st2 = new Student("men", 13, 1324);
        Student st3 = new Student("o", 14, 14);


        System.out.println("telebe bir");
        st1.showInfo();
        System.out.println("telebe iki");
        st2.showInfo();
        System.out.println("telebe uc");
        st3.showInfo();

    }
}
