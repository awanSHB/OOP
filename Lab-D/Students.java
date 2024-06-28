/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Students extends Persons {
    private String status;
    
    Students(){
        super();
        status = "Senior";
    }
    
    Students(String n, String a, int p, String e, String st){
        super(n, a, e, p);
        status = st;
    }
    
    public void setStatus(String st){
        status = st;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void displayS(){
        super.displayP();
        System.out.println("\n\nThe name is : "+name+"\nAddress is : "+address+"\nPhone no is : "+phone+"\nEmail is : "
                +email+"\nThe status is : "+status);
    }
}
