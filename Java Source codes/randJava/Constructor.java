public class Constructor{
	
	String name = "Luffy";
	int age = 35;
	public void Constructor(String newName, int newAge){
	name = newName;
	age = newAge;	
	System.out.println(name + " " + age +" years");
	}
	
	public static void main(String[] args){
	
	Constructor c1 = new Constructor();
	
	c1.Constructor("Arare",10);
	System.out.println(c1.name + " is " + c1.age);
	
	} 
}
