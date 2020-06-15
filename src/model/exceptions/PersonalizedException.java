package model.exceptions;

public class PersonalizedException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public PersonalizedException(String msg) {
		super(msg);
	}
	
}
