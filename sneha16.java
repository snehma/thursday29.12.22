import java.io.*;
import java.util.*;

class Student implements Serializable{
    private String student_id, student_name;
    private int attendance, marks;

    Student(String student_id, String student_name, int attandance, int marks) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.attendance = attandance;
        this.marks = marks;
    }
    public String toString() {
        return ("SId:" + this.student_id + " Name:" + this.student_name +
                " Attendance:" + this.attendance + " Marks:" + this.marks);
    }

}

public class Question3 {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("123", "Shubham Tiwari", 65, 89); 
        Student s2 = new Student("124", "Rahul Raj", 85, 59);
        Student s3 = new Student("125", "Padma Dvivedi", 75, 99);
        Student s4 = new Student("126", "Aswin", 69, 89);

        LinkedList<Student> ls = new LinkedList<Student>();
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        ls.add(s4);

        FileOutputStream fos = new FileOutputStream("D:\\AnudeepJavaExercises\\Exercises_29_12_2022\\io.txt");
        ObjectOutputStream ous = new ObjectOutputStream(fos);
        ous.writeObject(ls);
        fos.close();
        ous.close();
    }
}