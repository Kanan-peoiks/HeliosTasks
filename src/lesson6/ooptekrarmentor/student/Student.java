package lesson6.ooptekrarmentor.student;

public class Student {
    private String name;
    private int age;
    private int schoolNumber;

    public Student(String name, int age, int schoolNumber) {
        this.name = name;
        this.age = age;
        this.schoolNumber = schoolNumber;
    }

    void showInfo (){
        System.out.println("Telebe : "+name);
        System.out.println("Oxuduguvu mekteb: "+schoolNumber);
        System.out.println("Yashi: "+age);
    }



}
