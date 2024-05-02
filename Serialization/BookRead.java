import java.io.*;

class BookRead{
	public static void main(String args[]){
		try{
			FileInputStream fis = new FileInputStream("BookStore.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			
			while(true){
				Book b = new Book();
				b = (Book)ois.readObject();
				b.display();
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