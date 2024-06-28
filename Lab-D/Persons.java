/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Persons {
    protected String name;
    protected String address;
    protected String email;
    protected int phone;
    
    Persons(){
        name = "Nazar";
        address = "13u2012u";
        email = "qasim@gmail.com";
        phone = 03100;
    }
    
    Persons(String n, String a, String e, int p){
        name = n;
        address = a;
        phone = p;
        email = e;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setAddress(String a){
        address = a;
    }
    
    public void setPhone(int p){
        phone = p;
    }
    
    public void setEmail(String e){
        email = e;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public int getPhone(){
        return phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void displayP(){
        System.out.println("\n\nThe name is : "+name+"\nAddress is : "+address+"\nPhone no is : "+phone+"\nEmail is : "+email);
    }
}
