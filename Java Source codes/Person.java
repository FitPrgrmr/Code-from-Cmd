import java.util.*;
class YoungMan{
	public static void main(String[] args){
 	Person individual1 = new Person();
	individual1.setName("Jimmeh");
	individual1.getName();
   }	
}
public class Person{
	
	int age;
	String name;
	String eyeColour;

	public void setName(String newName){
	this.name = newName;
	}
	public String getName(){
	return name;
	}
}





