package phase1.enhancedapp.exception;

public class ValueExceptionE extends Exception {
	public ValueExceptionE() {
		
	}
	public ValueExceptionE(String name){
		super(name);
		System.out.println(name);
	}

}
