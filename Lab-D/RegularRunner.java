/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class RegularRunner {
    public static void main(String args[]){
        Regular regularobj = new Regular("Ahmed", "09000875", "Islamabad", 15000, 16000);
        regularobj.displayR();
        
        Adhoc adhocObj = new Adhoc("Ali", "0333330303", "Rawalpindi", 500, 23, 1500);
        adhocObj.displayA();
    }
}
