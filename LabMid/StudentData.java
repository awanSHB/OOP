import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.BufferedWriter;

class StudentData extends Person{
	
	private int marks;
	private int max;
	Student stu[] = new Student[5];
	StudentWrite sw;
	
	StudentData(){
		super("", "", "");
		marks = 0;
		max = 0;
	}
	
	void readData(){
		Scanner inp = new Scanner(System.in);
		System.out.println("\nEnter The Data For The Students  :- \n");
		for(int i=0; i<5; i++){
			System.out.println("\nEnter The Data For Student ["+(i+1)+"]\n");
				
			System.out.print("Enter the name        :  ");
			name = inp.next();
			
			System.out.print("Enter the Father_name :  ");
			father_name = inp.next();
			
			System.out.print("Enter the Phone_no    :  ");
			phone_no = inp.next();
			
			System.out.print("Enter the marks       :  ");
			marks = inp.nextInt();
			
			stu[i] = new Student(name, father_name, phone_no, marks);
		}
		//Here we are calling the StudentWrite class and passing array of objects
		//as an argument
		sw = new StudentWrite(stu);
		sw.writeStudent();
		// sw.readFile();
	}
	
	
	void FindMax(){
        for(int i=0; i<5; i++){
            if(stu[i].getMarks() >= max)
                max = stu[i].getMarks();
        }
	}
	
	void displayMax(){
		System.out.println("\n\n\nStudents with highest marks are :- \n");
        for(int i=0; i<5; i++){
            if(stu[i].getMarks()==max)
                stu[i].display();
        }
	}
}