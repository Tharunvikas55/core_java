package com.hdfc.atm.ui.service;

import java.util.Scanner;

import com.hdfc.atm.iservice.IAccountService;
import com.hdfc.atm.iservice.IAuthenticationService;
import com.hdfc.atm.service.AccountService;
import com.hdfc.atm.service.AuthenticationService;
import com.hdfc.atm.ui.iservice.ICUIService;

public class CUIService implements ICUIService {
	IAuthenticationService authenticationService = new AuthenticationService();
	Scanner scanner = new Scanner(System.in);

	@Override
	public void showCUI() {
		while (true) {
			showMenu();
		}
	}

	private void showMenu() {
		System.out.print("\n1.Deposit\n2.Withdraw\n3.Balance\n4.PIN Change\n5.Exit");
		promptUserChoice();
	}

	private void promptUserChoice() {
		System.out.print("\nenter choice: ");
		Integer choice = scanner.nextInt();
		performOperations(choice);
	}

	private void performOperations(Integer choice) {
		IAccountService accountService = new AccountService();
		Integer amount = null;
		switch (choice) {
		case 1:
			amount = readAmount();
			if (validateAmount(amount)) {
				if (accountService.deposit(amount)) {
					System.out.println("Amount deposited.");
				} else {
					System.out.println("Failed to deposit the amount.");
				}
			} else {
				System.out.println("Invalid amount entered.");
			}
			break;
		case 2:
			if(authorizeUser()){
				amount = readAmount();
				if (validateAmount(amount)) {
					if(accountService.getBalance()>=amount) {
					if (accountService.withdraw(amount)) {
						System.out.println("Amount deducted.");
					} else {
						System.out.println("Failed to deduct the amount.");
					}					
				
				}else {
					System.out.println("Insuficient balance");
				}
				}
				else {
					System.out.println("Invalid amount entered.");
				}
				}
			
			break;
		case 3:
			if(authorizeUser()){
				System.out.println("Balance: " + accountService.getBalance());
			}
			break;
		case 4:
			if(authorizeUser()){
				Integer newPin = readPIN();
				if(validatePIN(newPin)) {
					if(authenticationService.resetPin(newPin)) {
						System.out.println("PIN changed successfully.");
					}else {
						System.out.println("PIN change failed.");
					}
				}
				else {
					System.out.println("Invalid PIN entered.");
				}
			}
			break;
		case 5:
			System.exit(0);
		default:
			System.out.println("Invalid choice.");
			break;
		}
	}
	
	private boolean authorizeUser() {		
		boolean isAuthorized = false;
		Integer count = 1;
		Integer pin = null;
		while(count <=3) {
			pin = readPIN();
			if (validatePIN(pin)) {
				if(authenticationService.authenticate(pin)) {
					isAuthorized = true;
					break;
				}else {
					count++;
					if(count > 3) {
						System.out.println("Unauthorized user. Terminating the program.");
						System.exit(0);
					}					
				}				
			} else {
				System.out.println("Invalid PIN entered.");
			}			
		}
		return isAuthorized;
	}

	private Integer readAmount() {
		System.out.print("enter amount: ");
		return scanner.nextInt();
	}

	private Integer readPIN() {
		System.out.print("enter PIN: ");
		return scanner.nextInt();
	}

	private boolean validateAmount(Integer amount) {
		return ((amount > 0) && (amount % 100 == 0)) ? true : false;
	}

	private boolean validatePIN(Integer pin) {
		return ((pin > 999) && (pin <= 9999)) ? true : false;
	}
}