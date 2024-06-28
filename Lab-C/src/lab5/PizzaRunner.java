/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class PizzaRunner {
    public static void main(String args[]){
        String size = "Large";
        int sizecost = 14;
        int pep = 3;
        int ham = 4;
        int che = 5;
        Pizza p1 = new Pizza(size, sizecost, che, pep, ham);
        System.out.println(p1.getDescription());
        System.out.println("\nThe total cost is ==> "+p1.TotalCost());
    }
}
