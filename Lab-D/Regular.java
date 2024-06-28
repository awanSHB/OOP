/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Regular extends Employee{
    private int basicpay;
    Regular(String n, String p, String a, int al, int b){
        super(n, p, a, al);
        basicpay = b;
    }
    
    void displayR(){
        System.out.println("Name is : "+name+"\nPhone no is: "+phone+"\nAddress is : "+address+"\nAllowance is"+
        allowance+"\nBasic Pay is : "+basicpay);
    }
}
