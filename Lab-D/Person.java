/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Person {
    protected String name;
    protected String id;
    protected int phone;
    
    Person(){
        name = "Nazar";
        id = "fa21bds022";
        phone = 03100;
    }
    
    Person(String n, String i, int p){
        name = n;
        id = i;
        phone = p;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setId(String i){
        id = i;
    }
    
    public void setPhone(int p){
        phone = p;
    }
    
    public String getName(){
        return name;
    }
    
    public String getId(){
        return id;
    }
    
    public int getPhone(){
        return phone;
    }
    
    public void display(){
        System.out.println("The name is : "+name+"\nId is : "+id+"\nPhone no is : "+phone);
    }
}
