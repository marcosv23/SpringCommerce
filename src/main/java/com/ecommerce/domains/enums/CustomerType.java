package com.ecommerce.domains.enums;

public enum CustomerType 
{
	NATURALPERSON(1, "Natural Person"),
	LEGALENTITY(2, "Legal Entity");
	
	private int code;
	private String description;
	
	private CustomerType(int code, String description) {
		this.code = code;
		this.description = description;
	}
	

	private CustomerType(int code) {
		this.code = code;
	}



	public int getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}
	
	public static CustomerType toEnum(Integer code) 
	{
		if(code ==null) 
		{
			return null;
		}
		
		for(CustomerType x : CustomerType.values())
		{
			
			if(code.equals(x.getCode())) 
			{
				return x;
			}
			
	
		}
		throw new IllegalArgumentException("Invalid ID"+code);
		
	}
	
	
}
