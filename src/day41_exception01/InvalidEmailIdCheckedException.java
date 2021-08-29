package day41_exception01;

public class InvalidEmailIdCheckedException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidEmailIdCheckedException (String message){
		
		super(message);
	}
}
