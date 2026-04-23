package exception3;

public class Main {
    static void main(String[] args) {
        try{
            Student s1 = new Student("Ilkin", "Eyyubov", 21);
            Student s2 = new Student("Namiq", "Bebirov", 21);

            Student.addStudent(s1);
            Student.addStudent(s2);
        }catch (InvalidAgeException e){
            System.out.println("Error " + e.getMessage());
        }
        Student.StudentList();


    }
}
