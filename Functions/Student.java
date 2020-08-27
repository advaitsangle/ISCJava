import java.util.*;
public class Student{
    int adno, grade, rollno, total;
    String name, remark;
    public Student(String name, int adno, int grade, int rollno, int total){
        this.name = name;
        this.adno = adno;
        this.grade = grade;
        this.rollno = rollno;
        this.total = total;
    }
    public Student(){
        this.name = "";
        this.grade = 0;
        this.rollno = 0;
        this.total = 0;
    }
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.input();
        s2.input();
        Student s3 = s1.better(s2);
        s3.remark();
        s3.display();
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, admission number, grade, roll number, and total marks");
        name = sc.nextLine();
        adno = sc.nextInt();
        grade = sc.nextInt();
        rollno = sc.nextInt();
        total = sc.nextInt();
    }

    Student better(Student s1){
      if(total>s1.total)return this;
      else return s1;
    }
    public void remark(){
        int n = this.total;
        if(n<40)remark = "Fail";
        else if(n<50)remark =  "Pass";
        else if(n<60)remark= "Second class";
        else if(n<70)remark =  "First class";
        else if(n<90)remark = "Distinction";
        else if(n>90)remark = "Super";
        else remark = "N/A";
    }
    public void display(){
        System.out.println("Name: "+ name);
        System.out.println("Admission number: "+ adno);
        System.out.println("Grade: "+ grade);
        System.out.println("Roll number: "+ rollno);
        System.out.println("Total marks: "+ total);
        System.out.println("Status: "+ remark);
    }
}