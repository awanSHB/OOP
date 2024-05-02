import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class PersonTest{
	public static void main(String args[]){
		try{
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Persont.txt"));
			Person p = new Person();
			
			p.name = "Jakob Kenkov";
			p.age = 40;
			
			oos.writeObject(p);
			
		}catch(FileNotFoundException e1){
			e1.printStackTrace();
		}catch(IOException e2){
			e2.printStackTrace();
		}
		
		
	}
}