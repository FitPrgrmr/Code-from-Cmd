public class InferenceOfVar{
/**
Remeber for local variable type inference,(var) the compiler looks only at the line with the declaration.
If the variables question and answer were omitted from being initialized within the same line of declaration,
the compiler would throw an error message.

*/
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

