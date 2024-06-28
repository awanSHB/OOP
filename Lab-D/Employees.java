/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Employees extends Persons{
    protected String office;
    protected int salary;
    protected Date hired;
    
    Employees(String n, String a, int p, String e, String o, int sal){
        super(n, a, e, p);
        office = o;
        salary = sal;
        hired = new Date(11, 12, 2013);
    }
    
    void displayE(){
        super.displayP();
        System.out.println("\n\nThe name is "+name+"\nThe address is : "+address+"\nPhone # is : "+phone+"\nEmail is :"+
                email+"\nThe Office is : "+office+"\nThe salary is : "+salary);
    }
}
