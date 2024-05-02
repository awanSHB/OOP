import java.io.IOException;
public class Test {
    public static void main(String[] args) throws IOException{
		
		StudentData std = new StudentData();
		TeacherData tcd = new TeacherData();
		
		std.readData();
		tcd.readData();
		
		std.FindMax(); 
		tcd.FindMax();
		
		std.displayMax();
		tcd.displayMax();
        
        
    }
}
