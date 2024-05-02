public class Teacher extends Person{
    private int salary;
    
    Teacher(String n, String fn, String pn, int s){
        super(n, fn, pn);
        salary =s ;
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
    public void setSalary(int salary){
        this.salary = salary;
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
    public int getSalary(){
        return salary;
    }
    
    public void display(){
		super.display();
        System.out.println("Salary is      :-  "+salary);
    }
}
