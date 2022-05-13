import java.util.Random;
public class ImportExample{

	public static void main(String[] args){
	Random r = new Random();
	int num;
	num = r.nextInt(50);
	System.out.println("randomly generated number is: "+num);
	}
}