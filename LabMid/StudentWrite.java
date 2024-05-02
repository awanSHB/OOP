import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;

class StudentWrite {
	
	String name;
	String father_name;
	String phone_no;
	private int marks;
	
	Student[] std;
	StudentWrite(Student st[]){
		std = st;
	}
	
	void writeStudent(){
		try{
			BufferedWriter sr = new BufferedWriter(new FileWriter("Student_Record.txt"));
			sr.write("\n\nStudent's Record is :- ");
			for(int o = 0; o<5; o++){
				sr.write("\n\nName is        :-  "+std[o].getName());
				sr.write("\nFather_name is :-  "+std[o].getFather_name());
				sr.write("\nPhone_no is    :-  "+std[o].getPhone_no());
				sr.write("\nMarks are      :-  "+std[o].getMarks());
			}
			sr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	void readFile(){
		try{
			File fl = new File("Student_Record.txt");
			Scanner read = new Scanner(fl);
			System.out.println("\n\n");
			while(read.hasNextLine()){
				String line = read.nextLine();
				System.out.println(line);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}