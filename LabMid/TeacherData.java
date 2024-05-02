import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

class TeacherData extends Person{
	
	private int salary;
	private int max;
	Teacher tec[] = new Teacher[5];
	TeacherWrite tw;
	
	TeacherData(){
		super("", "", "");
		salary = 0;
		max = 0;
	}
	
	void readData(){
		Scanner inp = new Scanner(System.in);
		System.out.println("\n\nEnter The Data For The Teachers  :- \n");
		for(int i=0; i<5; i++){
			System.out.println("\nEnter The Data For Teacher ["+(i+1)+"]\n");
            System.out.print("Enter the name        :  ");
            name = inp.next();
            System.out.print("Enter the Father_name :  ");
            father_name = inp.next();
            System.out.print("Enter the Phone_no    :  ");
            phone_no = inp.next();
            System.out.print("Enter the salary      :  ");
            salary = inp.nextInt();
            tec[i] = new Teacher(name, father_name, phone_no, salary);
		}
		tw = new TeacherWrite(tec);
		tw.writeTeacher();
		// tw.readFile();
	}
	
	
	void FindMax(){
        for(int i=0; i<5; i++){
            if(tec[i].getSalary() >= max)
                max = tec[i].getSalary();
        }
	}
	
	void displayMax(){
		System.out.println("\n\n\nTeachers with highest salary are :- \n");
        for(int i=0; i<5; i++){
            if(tec[i].getSalary()==max)
                tec[i].display();
        }
	}
}