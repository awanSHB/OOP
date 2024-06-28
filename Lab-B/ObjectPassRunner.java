/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

/**
 *
 * @author WIZ TECH
 */
public class ObjectPassRunner {
    public static void main(String args[]){
        ObjectPass p = new ObjectPass();
        p.value = 5;
        System.out.println("The value before calling is : "+p.value);
        ObjectPass.increment(p);
        System.out.println("The value after calling is : "+p.value);
    }
}
