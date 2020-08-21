package com.ecommerce.services.exception;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg) 
	{
		super(msg);
	}
	
	public ObjectNotFoundException(String msg, Throwable cause)// another exception to show the cause
	{
		super(msg,cause);
	}

}
