import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;

class TeacherWrite {
	
	String name;
	String father_name;
	String phone_no;
	private int marks;
	
	Teacher[] tch;
	TeacherWrite(Teacher tc[]){
		tch = tc;
	}
	
	void writeTeacher(){
		try{
			BufferedWriter sr = new BufferedWriter(new FileWriter("Teacher_Record.txt"));
			sr.write("Teacher's Record is :- ");
			for(int o = 0; o<5; o++){
				sr.write("\n\nName is        :-  "+tch[o].getName());
				sr.write("\nFather_name is :-  "+tch[o].getFather_name());
				sr.write("\nPhone_no is    :-  "+tch[o].getPhone_no());
				sr.write("\nSalary is      :-  "+tch[o].getSalary());
			}
			sr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	void readFile(){
		try{
			File fl = new File("Teacher_Record.txt");
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