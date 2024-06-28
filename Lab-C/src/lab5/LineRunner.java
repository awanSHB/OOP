/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class LineRunner {
    public static void main(String args[]){
        int x1 = 12;
        int x2 = 16;
        int y1 = 14;
        int y2 = 18;
        
        Point p1 = new Point(x1, y1);
        p1.display();
        
        Point p2 = new Point(x2, y2);
        p2.display();
        
        Line l1 = new Line();
        l1.setX1(x1);
        l1.setY1(y1);
        l1.setX2(x2);
        l1.setY2(y2);
        System.out.println("\nThe length of the line 1 is : "+l1.calculate(x1, x2, y1, y2));
        
        Line l2 = new Line();
        l2.setX1(10);
        l2.setY1(11);
        l2.setX1(12);
        l2.setY2(13);
        System.out.println("\nThe lenght of the line 2 is : "+l2.calculate(10, 11, 12, 13));
        
    }
    
}
