/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Runner {
    public static void main(String args[]){
        Persons p = new Persons("Qasim", "koralchowk4103", "Qasim@gmail.com", 4918094);
        System.out.println("The Person's data is ==>");
        System.out.println("------------------------");
        p.displayP();
        System.out.println("________________________");
        System.out.println("________________________\n\n");
        
        Students s = new Students("Ali", "street13049", 49180491, "ali@gmail.com", "Junior");
        System.out.println("The Student's data is ==>");
        System.out.println("------------------------");
        s.displayS();
        System.out.println("________________________");
        System.out.println("________________________\n\n");
        
        Employees e = new Employees("Ali", "street13049", 49180491, "ali@gmail.com", "hillview", 701740);
        System.out.println("The Employee's data is ==>");
        System.out.println("------------------------");
        e.displayE();
        System.out.println("________________________");
        System.out.println("________________________\n\n");
        
        Faculty f = new Faculty("Ahmed", "street13049", 49180491, "ali@gmail.com", "hillview", 701740, 12, "18");
        System.out.println("The Faculty's data is ==>");
        System.out.println("------------------------");
        f.displayF();
        System.out.println("________________________");
        System.out.println("________________________\n\n");
        
        Staff st = new Staff("Ahmed", "street13049", 49180491, "ali@gmail.com", "hillview", 701740, "Professor");
        System.out.println("The Faculty's data is ==>");
        System.out.println("------------------------");
        st.displaySt();
        System.out.println("________________________");
        System.out.println("________________________\n\n");
    }
}
