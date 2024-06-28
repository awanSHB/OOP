/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class Manager {
    private String title;
    private double dues;
    private EmployeeRecord emp;
    private StudentRecord stu;
    
    public Manager(String t, double d, EmployeeRecord e, StudentRecord s){
        title = t;
        dues = d;
        emp = e;
        stu = s;
    }
    
    public void display(){
        System.out.println("\nThe title is : "+title+"\nDues are : "+dues+"\nEmployee Record is: \nEmployee Id is"+emp.getEmp_id()+
                "\nEmployee salary is : "+emp.getSalary()+"\nStudent Record is: \nDegree is : "+stu.getDegree());
    }
}
