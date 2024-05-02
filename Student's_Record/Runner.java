import java.util.*;

class Runner{
	public static void main(String args[]){
		Scanner inp = new Scanner(System.in);
		
		Student[] st = new Student[5];
		st[0] = new Student("Ali", 80, 20, "3rd", "2A");
		st[1] = new Student("Qasim", 70, 18, "2nd", "1A");
		st[2] = new Student("Ahmed", 60, 19, "3rd", "1A");
		st[3] = new Student("Hassan", 75, 21, "4th", "3A");
		
		for(int i=0; i<4; i++)
			st[i].display();
		
		System.out.print("\n\n\nEnter the marks/range to search for the student: ");
		int marks_search = inp.nextInt();
		for(int i=0; i<4; i++){
			if(st[i].marks>=marks_search)
				st[i].display();
		}
		
		// st[] s = new st[4];
		
	}
}