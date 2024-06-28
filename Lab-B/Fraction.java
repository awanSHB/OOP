/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author WIZ TECH
 */
public class Fraction {
    public double num1;
    public double num2;
    
    public Fraction(){
        num1 = 0.0;
        num2 = 0.0;
    }
    
    public Fraction(int a, int b){
        num1 = a;
        num2 = b;
    }
    
    public void setNum1(int a){
        num1 = a;
    }
    public void setNum2(int b){
        num2 = b;
    }
    
    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }
    
    public double Ratio(){
        double frac = num1/num2;
        return frac;
    }
    
    public boolean compare(Fraction a1, Fraction a2){
        if((a1.num1/a1.num2) == (a2.num1/a2.num2)){
            return true;
        }else{
            return false;
        }
    }
}
