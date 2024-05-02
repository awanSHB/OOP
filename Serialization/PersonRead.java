import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

class PersonRead{
	public static void main(String args[]){
		try{
			FileInputStream fis = new FileInputStream("Persont.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			while(true){
				
				Person read = (Person)ois.readObject();
				System.out.println(read.name);
				System.out.println(read.age);
			}
			
		}catch(EOFException eof){
			System.out.println("End Of File!!!");
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}