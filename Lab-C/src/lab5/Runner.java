/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class Runner {
    public static void main(String[] args){
        StudentRecord s = new StudentRecord();
        s.setDegree("MBA");
        EmployeeRecord e = new EmployeeRecord();
        e.setEmp_id(1);
        e.setSalary(25000);
        Manager m = new Manager("Finance Manager", 5000, e, s);
        m.display();
    }
}
