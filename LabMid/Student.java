public class Student extends Person{
    private int marks;
    
    Student(String name, String father_name, String phone_no, int marks){
        super(name, father_name, phone_no);
        this.marks = marks;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public void setFather_name(String father_name){
        this.father_name = father_name;
    }
    public void setPhone_no(String phone_no){
        this.phone_no = phone_no;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }
    
    public String getName(){
        return name;
    }
    public String getFather_name(){
        return father_name;
    }
    public String getPhone_no(){
        return phone_no;
    }
    public int getMarks(){
        return marks;
    }
    
    public void display(){
        super.display();
		System.out.println("Marks are      :-  "+marks);
    }
}
