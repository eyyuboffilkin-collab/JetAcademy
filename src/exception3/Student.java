package exception3;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String surname;
    int age;

   static List<Student>studentList = new ArrayList<>();

    public Student(String name, String surname, int age) {
        if(age < 18){
            throw new InvalidAgeException("Yasi 18-den kicikdir");
        }
        this.name = name;
        this.surname = surname;
        this.age = age;
    }



    public static void addStudent(Student student){
        studentList.add(student);
    }
    public static void StudentList(){
        for(Student s : studentList){
            System.out.println(s.name + " " + s.surname + " - " + s.age);
        }
    }


}
