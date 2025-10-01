package lesson5;

public class Student {
    private String name;
    private int age;
    private int schoolNumber;

    public Student(String name, int age, int schoolNumber) {
        this.name = name;
        this.age = age;
        this.schoolNumber = schoolNumber;
    }
//----------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//----------------------------------------------------
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//----------------------------------------------------
    public int getSchoolNumber() {
        return schoolNumber;
    }

    public void setSchoolNumber(int schoolNumber) {
        this.schoolNumber = schoolNumber;
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School No: " + schoolNumber);
    }
}
