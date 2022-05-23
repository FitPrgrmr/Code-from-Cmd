public class InferenceOfVar{

	boolean value;
	public void doesThisCompile(boolean check){
	
		var question = 1;
		
		var answer = 0;
		
		if(check){
		answer = 2;
		}else {
		answer = 3;
		}
		System.out.println(answer);
	}	
			
	


	public static void main(String[] args){
	
		InferenceOfVar iV = new InferenceOfVar();
		iV.doesThisCompile(iV.value);
	
	}


	}

