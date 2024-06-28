/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Student extends Person {
    private String rollno;
    private int marks;
    
    Student(){
        super();
        rollno = "fa21bds015";
        marks = 80;
    }
    
    Student(String n, String i, int p, String r, int m){
        super(n, i, p);
        rollno = r;
        marks = m;
    }
    
    public void setRollno(String r){
        rollno = r;
    }
    
    public void setMarks(int m){
        marks = m;
    }
    
    public String getRollno(){
        return rollno;
    }
    
    public int getMarks(){
        return marks;
    }
    
    public void displayF(){
        System.out.println("Roll # : "+rollno+"\nMarks # : "+marks);
    }
}
