// D:\PROGRAMMING\OOP\Serialization
import java.io.Serializable;

class Person implements Serializable{
	public String name;
	public int age;
	Person(){}
	Person(String n, int a)
	{
		name=n;
		age=a;
	}
	
	public void setAge(int a){
		age = age;
	}
	
	public String getName(){
		return name;
		
	}
}