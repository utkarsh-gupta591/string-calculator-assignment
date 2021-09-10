package main.exception;

public class NegativeNumberException extends RuntimeException{
	
	private String message;
	public NegativeNumberException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return this .message;
	}
}
