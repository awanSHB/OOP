import java.io.*;
import java.util.*;

class BookCheck{
	public static void main(String args[]){
		try{
			FileInputStream fis = new FileInputStream("BookStore.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Scanner inp = new Scanner(System.in);
			
			String name = "";
			System.out.print("Enter the book whose record you want to show: ");
			name = inp.nextLine();
			
			
			while(true){
				Book b = new Book();
				b = (Book)ois.readObject();
				if(name.equals(b.name)){
					b.display();
					break;
				}
			}
			
		}catch(EOFException eof){
			System.out.println("Book Not Found !!! END OF File!!!");
		}catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}catch(FileNotFoundException fnf){
			fnf.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}