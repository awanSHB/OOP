/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import static java.lang.Math.sqrt;

/**
 *
 * @author WIZ TECH
 */
public class Line {
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    
    public Line(){}
    
    public void setX1(int sp1){
        x1 = sp1;
    }
    public void setX2(int ep1){
        x2 = ep1;
    }
    public void setY1(int sp1){
        y1 = sp1;
    }
    public void setY2(int ep2){
        y2 = ep2;
    }
    
    public int getX1(){
        return x1;
    }
    public int getX2(){
        return x2;
    }
    public int setY1(){
        return y1;
    }
    public int setY2(){
        return y2;
    }
    
    double calculate(int a1, int a2, int b1, int b2){
        double res = sqrt((a2-a1)*2+(b2-b1)*2);
        return res;
    }
}
