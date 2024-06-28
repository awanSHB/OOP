/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author WIZ TECH
 */
public class FractionRunner {
    public static void main(String args[]){
        Fraction f1 = new Fraction(6, 2);
        Fraction f2 = new Fraction(9, 3);
        Fraction f3 = new Fraction();
        
        System.out.println("The ratio for object 1 is "+f1.Ratio());
        System.out.println("The ratio for object 2 is "+f2.Ratio());
        
        System.out.println(f3.compare(f1, f2));
        
    }
}
