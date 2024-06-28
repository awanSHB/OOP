/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Staff extends Employees{
    protected String title;
    
    Staff(String n, String a, int p, String e, String o, int sal, String tt){
        super(n, a, p, e, o, sal);
        title = tt;
    }
    
    public void displaySt(){
        System.out.println("\n\nThe name is : "+name+"\nThe address is : "+address+"\nTh Email is : "+
                email+"\nThe phone # : "+phone+"\nThe salary is : "+salary+"\nTitle is : "+title);
    }
}
