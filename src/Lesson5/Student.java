package Lesson5;

public class Student {
    public String name;
    public int age;


    public static Student create(){
        Student students = new Student();
        students.age = (18+(int)(Math.random()*13));
        String[] student_name = {"Vasya", "Petya", "Kolya", "Masha", "Henrik", "Nastya", "Yura", "Sveta", "Vova", "Dima"};
        int n = (int) (Math.random() * student_name.length);
        students.name = student_name[n];
        return students;
    }
}
