/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class BookRunner {
    public static void main(String args[]){
        Address a = new Address();
        a.setHouse(1234);
        a.setStreet("Street 123A");
        a.setCity("Lahore");
        a.setCode(309184);
        String n = "QASIM";
        Person p = new Person(n, a);
        System.out.println("Author's Detail is :==> ");
        p.display();
        
        Book b = new Book("IQRA Copy House", "Physics 10th");
        b.display();
    }
}
