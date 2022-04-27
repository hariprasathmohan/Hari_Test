//$Id$
package com.hari.Models;

public class ATMModel extends AccountModel {
	private String pin;

	public ATMModel(String accountNumber,String pin) {
		super(accountNumber);
		this.pin = pin;
	}

	public boolean validatePin(String pin) {
		if(this.pin.equals(pin))
			return true;
		return false;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}
	
}
