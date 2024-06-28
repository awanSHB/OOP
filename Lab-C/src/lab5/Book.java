/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class Book {
    private String publisher;
    private String bookname;
    
    public Book(String p, String n){
        publisher = p;
        bookname = n;
    }
    
    public void display(){
        System.out.println("\nThe Book name is : "+bookname+"\nThe publisher is : "+publisher);
    }
}
