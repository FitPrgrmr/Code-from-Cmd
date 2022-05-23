public class Constructor1{

	//public void findAnswer(boolean check){}
	
	public static int magicNum;
	boolean value = true;
	void checkAnswer(){
		if(value == true){
		System.out.println("Passed!");
		}else{System.out.println("value is "+ value);}
		
		}
	public static void main(String[] args){
	
		Constructor1 c1 = new Constructor1();
		Constructor1 c2 = new Constructor1();
		c1.magicNum = 4;
		System.out.println(magicNum);
		c2.magicNum = magicNum + 6;
		System.out.println(c2.magicNum);
		c1.value = false;
		c1.checkAnswer();
		c2.value = false;
		c2.checkAnswer();
		
		System.out.println(c2.magicNum);
		
	}





}
