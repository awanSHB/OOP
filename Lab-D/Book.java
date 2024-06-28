/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Book extends Publication
{
        private int pagecount;
        public Book()
        {
            super();
            pagecount=0;
        }
        public Book(String title,double price,int pagecount)
        {
            super(title,price);
            this.pagecount=pagecount;
        }
        public void setpagecount(int pagecount)
        {
            this.pagecount=pagecount;
        }
        public void set_title(String title)
        {
            setTitle(title);
        }
        public void set_price(double price)
        {
            setPrice(price);
        }
        public int getpagecount()
        {
            return pagecount;
        }
        public String get_title()
        {
            return super.getTitle();
        }
        public double get_price()
        {
           return super.getPrice();
        }
        public void display()
        {
            super.display();
            System.out.print("\nNo of pages : "+pagecount);
        }
}
