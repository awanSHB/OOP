/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Adhoc extends Employee{
    private int numberOfworkingdays;
    private int wage;
    
    Adhoc(String n, String p, String a, int al, int nw, int w){
        super(n, p, a, al);
        numberOfworkingdays = nw;
        wage = w;
    }
    
    public void displayA(){
        System.out.println("\n\nThe name is : "+name+"\nPhone no is : "+phone+"\nThe address is : "+
                address+"\nThe Allowance is: "+allowance+"\nNumberOfworkingDays : "+numberOfworkingdays+"\nWage is : "+wage);
    }
}
