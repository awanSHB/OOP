/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Date{
    protected int day;
    protected int month;
    protected int year;
    
    Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }
    
    void displayD(){
        System.out.println(month+"/"+day+"/"+year);
    }
}
