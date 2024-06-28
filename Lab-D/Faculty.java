/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Faculty extends Employees{
    protected int hours;
    protected String rank;
    
    Faculty(String n, String a, int p, String e, String o, int sal, int hor, String r){
        super(n, a, p, e, o, sal);
        hours = hor;
        rank = r;
    }
    
    public void displayF(){
        super.displayE();
        System.out.println("\n\nThe name is : "+name+"\nThe address is : "+address+"\nTh Email is : "+
                email+"\nThe phone # : "+phone+"\nThe salary is : "+salary+"\nWorking hours is : "+
                hours+"\nRank is : "+rank);
    }
}
