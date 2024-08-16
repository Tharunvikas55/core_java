package com.hdfc.atm.service;

import com.hdfc.atm.iservice.IAuthenticationService;

public class AuthenticationService implements IAuthenticationService {
	private Integer passCode = 1980;

	@Override
	public boolean authenticate(Integer pin) {

		return passCode.equals(pin) ? true : false;
	}

	@Override
	public boolean resetPin(Integer newPin) {
		boolean isChanged = false;
		try {
			this.passCode = newPin;
			isChanged = true;
		} catch (Exception ex) {
			System.out.println("Exception raised while changing the PIN:" + ex.getMessage());
		}
		return isChanged;
	}
}