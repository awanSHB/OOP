/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author WIZ TECH
 */
public class Point {
    public int X;
    public int Y;
    
    public Point(){
        X = 0;
        Y = 0;
    }
    
    public Point(int a, int b){
        X = a;
        Y = b;
    }
    
    public void setX(int a){
        X = a;
    }
    
    public void setY(int b){
        Y = b;
    }
    
    public int getX(){
        return X;
    }
    
    public int getY(){
        return Y;
    }
    
    public Point Add(Point pa, Point pb){
        Point p_new = new Point(X + pa.X + pb.X, Y + pa.Y + pb.Y);
        return p_new;
    }
    
    public void show(){
        System.out.println(X);
        System.out.println(Y);
    }
}
