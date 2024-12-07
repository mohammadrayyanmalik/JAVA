package com.learn.Ecommerce.projection;

import org.springframework.beans.factory.annotation.Value;

public interface AddressProjection {
	String getCity();
	String getState();
	String getPincode();
	
	
	default String getAddress()
	{
		return getCity()+" , "+getState();
	}
	
	
}
