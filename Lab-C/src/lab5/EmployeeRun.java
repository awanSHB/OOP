/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class EmployeeRun {
    public static void main(String args[]){
        Date b = new Date(1, 12, 1990);
        Date h = new Date(5, 6, 2016);
        employee e1 = new employee("xxx", "yyy", b, h);
        e1.display();
    }
}
