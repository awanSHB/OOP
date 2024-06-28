/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Runnerr 
{
    public static void main(String[] args) 
    {
        Book b1=new Book("Eat That Frog",90.50,5000);
        Tape t1=new Tape("Eat that Frog",50.50,90);
        System.out.print("\n _____________________________\n");
        System.out.print("|                             |\n");
        System.out.print("| Displaying data of a Book   |\n");
	System.out.print("|_____________________________|\n");
        b1.display();
        System.out.print("\n _____________________________\n");
	System.out.print("|                             |\n");
	System.out.print("| Displaying data of a Tape   |\n");
	System.out.print("|_____________________________|\n");
        t1.display();
        System.out.println();
    }
}
