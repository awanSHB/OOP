import java.io.*;

class Book implements Serializable{
	public String name;
	public String publisher;
	public Person p;
	
	Book(){
		name = "";
		publisher = "";
		p = new Person();
	}
	
	
	Book(String n, String pu, Person pr){
		name = n;
		publisher = pu;
		p = pr;
	}
	
	public String getName(){
		return name;
	}
	
	public void display(){
		System.out.println("\nBook name is :- "+name+"\nPublisher name is :- "+publisher+
		"\nAuthor name is :- "+p.name+"\nAuthor age is :- "+p.age);
	}
	
}