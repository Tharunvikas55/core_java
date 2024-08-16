package com.hdfc.atm.service;

import com.hdfc.atm.iservice.IAccountService;

public class AccountService implements IAccountService {
	private static Integer balance = 1000;

	@Override
	public boolean deposit(Integer amount) {
		boolean isDeposited = false;
		try {
			this.balance += amount;
			isDeposited = true;
		} catch (Exception ex) {
			System.out.println("Exception raised while depositing the amount:" + ex.getMessage());
		}
		return isDeposited;
	}

	@Override
	public boolean withdraw(Integer amount) {
		boolean isDebuted = false;
		try {
			this.balance -= amount;
			isDebuted = true;
		} catch (Exception ex) {
			System.out.println("Exception raised while debuting the amount:" + ex.getMessage());
		}
		return isDebuted;
	}

	@Override
	public Integer getBalance() {
		return this.balance;
	}

}
