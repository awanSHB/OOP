/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class Point {
    private int x_cord;
    private int y_cord;
    
    public Point(){
        
    }
    public Point(int x, int y){
        x_cord = x;
        y_cord = y;
    }
    
    public void setX_cord(int x){
        x_cord = x;
    }
    public void setY_cord(int y){
        y_cord = y;
    }
    
    public int getX_cord(){
        return x_cord;
    }
    public int getY_cord(){
        return y_cord;
    }
    
    public void display(){
        System.out.println("\nThe x_cord is : "+x_cord+"\nThe y_cord is : "+y_cord);
    }
    
}
