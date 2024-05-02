import java.io.*;

class BookTest{
	public static void main(String args[]){
		try{
			
			FileOutputStream fos = new FileOutputStream("BookStore.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			Person p = new Person();
			p.name = "Qasim";
			p.age = 20;
			Book b = new Book("JavaScript Hard1", "Arrayein Publisher", p);
			oos.writeObject(b);
			
			
			p = new Person("Bilal",21);
			b = new Book("JavaScript Hard2", "Arrayein Publisher", p);
			oos.writeObject(b);
			
			
			Person p1 = new Person();
			p1.name = "Ashhad";
			p1.age = 22;
			b = new Book("JavaScript Hard3", "Arrayein Publisher", p1);
			oos.writeObject(b);
			
			
			Person p2 = new Person();
			p2.name = "Hassan";
			p2.age = 23;
			b = new Book("JavaScript Hard4", "Arrayein Publisher", p2);
			oos.writeObject(b);
			
			Person p3 = new Person();
			p3.name = "Husnain";
			p3.age = 24;
			b = new Book("JavaScript Hard5", "Arrayein Publisher", p3);
			oos.writeObject(b);
			
			
			
		}catch(FileNotFoundException fne){
			fne.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}
}