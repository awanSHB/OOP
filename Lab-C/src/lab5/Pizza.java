/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author WIZ TECH
 */
public class Pizza {
    private String size;
    private int sizecost;
    private int no_of_cheese;
    private int no_of_pep;
    private int no_of_ham;
    
    public Pizza(String s, int sc, int ch, int pep, int ham){
        size = s;
        sizecost = sc;
        no_of_cheese = ch;
        no_of_pep = pep;
        no_of_ham = ham;
    }
    
    public void setSize(String s){
        size = s;
    }
    public void setSizecost(int sc){
        sizecost = sc;
    }
    public void setNo_of_cheese(int ch){
        no_of_cheese = ch;
    }
    public void setNo_of_pep(int p){
        no_of_pep = p;
    }
    public void setNo_of_ham(int h){
        no_of_ham = h;
    }
    
    public String getSize(){
        return size;
    }
    public int getSizecost(){
        return sizecost;
    }
    public int getNo_of_cheese(){
        return no_of_cheese;
    }
    public int getNO_of_pep(){
        return no_of_pep;
    }
    public int getNo_of_ham(){
        return no_of_ham;
    }
    
    public String getDescription(){
        return ("The size of pizza is "+size+"\nThe Quatity of each toping is :==>\n"
                + "Cheese ==> "+no_of_cheese+"\nPeproni ==> "+no_of_pep+"\nham ==> "+no_of_ham);
    }
    
    public double TotalCost(){
        double res = sizecost + (no_of_cheese*2) + (no_of_pep*2) + (no_of_ham*2);
        return res;
    }
}
