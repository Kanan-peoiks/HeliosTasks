package lesson6.ooptekrarmentor.student;

public class StudentMain {
    public static void main(String[] args) {

        Student st1= new Student("LEYLA", 20, 234);
        Student st2 = new Student("Kenan", 20, 233);

        st1.showInfo();
        st2.showInfo();
    }
}
