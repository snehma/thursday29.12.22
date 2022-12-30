import java.io.*;
import java.util.*;

class Student  {
    private String student_id, student_name;
    private int attendance, marks;

    Student(String student_id, String student_name, int attandance, int marks) {
        this.student_id = student_id;
        this.student_name = student_name;
        this.attendance = attandance;
        this.marks = marks;
    }

  
    public String toString() {
        return ("ID:" + this.student_id + " Name:" + this.student_name +
                " Attendance:" + this.attendance + " Marks:" + this.marks);
    }

} 
    public class StudentDetails{
    public static void main(String[] args){
        Student s1 = new Student("202221", "sneha", 95, 82);
        Student s2 = new Student("202223", "mayank", 80, 95);
        Student s3 = new Student("202225", "shivani", 95, 60);
        Student s4 = new Student("202219", "deepak", 69, 06);

        HashSet<Student> hs = new HashSet<>();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        Iterator it = hs.iterator();
        while(it.hasNext()){
              System.out.println(it.next()+"\n");
		}
 			
	for(Student x:hs){
		System.out.println(x);
          }

        

	}