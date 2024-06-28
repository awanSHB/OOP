/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class Person {
    private String name;
    Address adr = new Address();
    
    public Person(String n, Address a){
        name = n;
        adr = a;
    }
    
    public void display(){
        System.out.println("\nPerson's name is "+name+"\nComplete Address is: \nHome address : "+adr.getHouse()+
                "\nStreet Address is : "+adr.getStreet()+"\nCity name is : "+adr.getCity()+"\nThe code is : "+adr.getCode());
    }
}
