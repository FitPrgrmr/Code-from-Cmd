import java.util.*;//Imports java.util.Random among other things
public class ImportExample{

	public static void main(String[] args){
	Random r = new Random();
	int num;
	num = r.nextInt(50);
	System.out.println("randomly generated number is: "+num);
	}
}