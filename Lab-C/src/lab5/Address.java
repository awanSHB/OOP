/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class Address {
    private String street;
    private int house;
    private String city;
    private int code;
    
    public Address(){ 
    }
    
    public void setStreet(String s){
        street = s;
    }
    public void setHouse(int h){
        house = h;
    }
    public void setCity(String c){
        city = c;
    }
    public void setCode(int cd){
        code = cd;
    }
    
    public String getStreet(){
        return street;
    }
    public int getHouse(){
        return house;
    }
    public String getCity(){
        return city;
    }
    public int getCode(){
        return code;
    }
}
