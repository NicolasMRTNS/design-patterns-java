package com.design.patterns.java.example.abstractfactory;

public class VisaPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		return false;
	}

}
