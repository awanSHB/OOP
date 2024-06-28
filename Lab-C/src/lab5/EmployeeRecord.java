/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class EmployeeRecord {
    private int emp_id;
    private double salary;
    
    public EmployeeRecord(){
        
    }
    public void setEmp_id(int id){
        emp_id = id;
    }
    public int getEmp_id(){
        return emp_id;
    }
    public void setSalary(double s){
        salary = s;
    }
    public double getSalary(){
        return salary;
    }
}
