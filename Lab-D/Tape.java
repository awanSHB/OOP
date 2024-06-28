/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab06;

/**
 *
 * @author WIZ TECH
 */
public class Tape extends Publication
{
        private double p_time;
        public Tape()
        {
            super();
            p_time=0.0;
        }
        public Tape(String title,double price,double p_time)
        {
            super(title,price);
            p_time=0.0;
        }
        public void set_p_time(double p_time)
        {
            this.p_time=p_time;
        }
        public void set_title(String title)
        {
            setTitle(title);
        }
        public void set_price(double price)
        {
            setPrice(price);
        }
        public double get_p_time()
        {
            return p_time;
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
            System.out.print("\nPlaying time : "+p_time+" min");
        }
}
