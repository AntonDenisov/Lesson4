package Lesson5;

public class Students {
    public static void main(String[] args) {
            Student[] students = new Student[10];{
                for (int i = 0; i< students.length;i++)
                    students[i] = Student.create();
                System.out.println("[" + "Student name: "  + Student.create().name + " ; " + "Student age: " + Student.create().age + "]");
        }
    }
}
