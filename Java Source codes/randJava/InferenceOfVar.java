public class InferenceOfVar{
/**
Remeber for local variable type inference,(var) the compiler looks only at the line with the declaration.

The initial value used to determine the type of the Inference var need to be part of the same statement.
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

