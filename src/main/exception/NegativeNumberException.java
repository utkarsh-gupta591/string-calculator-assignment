package main.exception;

public class NegativeNumberException extends Exception{
	
	private String message;
	NegativeNumberException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return this .message;
	}
}
