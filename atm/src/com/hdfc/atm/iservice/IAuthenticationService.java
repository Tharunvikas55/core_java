package com.hdfc.atm.iservice;

public interface IAuthenticationService {
	public boolean authenticate(Integer pin);

	public boolean resetPin(Integer newPin);
}
