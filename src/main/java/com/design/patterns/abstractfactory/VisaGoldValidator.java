package com.design.patterns.abstractfactory;

public class VisaGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}
	
}
