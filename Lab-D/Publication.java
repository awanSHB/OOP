/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Publication
{
    private String title;
    private double price;
    public Publication()
    {
        title="none";
        price=0;
    }
    public Publication(String title,double price)
    {
        this.title=title;
        this.price=price;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public String getTitle()
    {
        return title;
    }
    public double getPrice()
    {
        return  price;
    }
    public void display()
    {
        System.out.print("\nTitle of publication :"+title+"\nPrice : $"+price);
    }
}
