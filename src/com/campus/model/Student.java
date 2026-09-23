package com.campus.model;
public class student{
    //encapsulation - data hiding
    //instance variables
    private int studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;
    //static variblies
    static int studentcount=0;
    
    //default consturtor
    public student(){
        studentcount++;

    }
    //parameterized construtor
    public student(int studentid,String studentname,int age,string department,int[]marks){
        this.studentid=studentid;
        this.studentname=studentname;
        this.age=age;
        this.department=department;
        this.marks=marks;
        studentcount++;
    }
    //getters
    public int getstudentid(){
        return studentid;
    }
    public String getstudentname(){
        return studentname;
    }
    public int getmark(){
        return marks;
    }
    public int getage(){
        return age;
    }
    //setters
    public void setstudentid(int studentid){
        this.studentid=student;
    }
    public void setstudentname(string studentname){
        this.studentname=studentname;
    }
    public void setstudentage(int age){
        this.age=age;
    }
    public void setdepartment(int department){
        this.department=department;
    }
    public void setmark(int marks){
        this.marks=marks;
    }
//instance method-belongs to object
    public void displaStudentInfo(){
        System.out.println("student ID:"+ studentid);
        System.out.println("student Name:"+ studentname);
        System.out.println("Age:"+age);
        System.out.print("Department:"+department);
    
    }
    public void dispayStudentInfo(boolean showMarks){
        displayStudentInfo();
        if (showMarks){
            System.out.println("Marks:"+ java.util.Array.toString(marks));
        }
    } 

    
    //static method belongs to class, not to object
    public static void displaystudentcount(){
        System.out.println("total number students;"+studentcount);
    }
}