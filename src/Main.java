     // TODO: Create a class called Student with name, rollNumber, and grade
class Student{
     String name;
     int rollNumber;
     char grade;
     displayDetails(){
          System.out.println("Name: "+name);
          System.out.println("Roll Number: "+rollNumber);
          System.out.println("Grade: "+grade);
}
    // TODO: Create a method to display student details
public class Main {
      public static void main(String[] args) {
           Student student = new Student();
           student.name="John";
           student.rollNumber=50;
           student.grade='A';
           displayDetails();
        // TODO: Create a Student object and call the method to display details
    }
}
