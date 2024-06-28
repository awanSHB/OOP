/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author WIZ TECH
 */
public class Distance {
    public double feet;
    public double inch;
    
    public Distance(){
        feet = 0.0;
        inch = 0.0;
    }
    
    public Distance(double f, double i){
        feet = f;
        inch = i;
    }
    
    public void setFeet(double f){
        feet = f;
    }
    
    public void setInch(double i){
        inch = i;
    }
    
    public double getFeet(){
        return feet;
    }
    
    public double getInch(){
        return inch;
    }
    
    public Distance Add(Distance d){
        Distance d_new = new Distance(feet + d.feet, inch + d.inch);
        return d_new;
    }
    
    public void show(){
        System.out.println(feet + inch);
    }
}
