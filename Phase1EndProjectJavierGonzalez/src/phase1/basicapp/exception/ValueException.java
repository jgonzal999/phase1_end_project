package phase1.basicapp.exception;

public class ValueException extends Exception {
	public ValueException() {
		
	}
	public ValueException(String name){
		super(name);
		System.out.println(name);
	}

}
