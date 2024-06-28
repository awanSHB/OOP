/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author WIZ TECH
 */
public class DistanceRunner {
    public static void main(String args[]){
        Distance d1 = new Distance(16, 10);
        Distance d2 = new Distance(20, 12);
        Distance d3 = new Distance();
        d3 = d1.Add(d2);
        d3.show();
    }
}
