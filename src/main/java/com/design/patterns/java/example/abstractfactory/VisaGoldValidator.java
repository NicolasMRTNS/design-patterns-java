package com.design.patterns.java.example.abstractfactory;

public class VisaGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}
	
}
