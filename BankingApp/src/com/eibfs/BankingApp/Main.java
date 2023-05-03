package com.eibfs.BankingApp;
import java.time.LocalDate;

import com.eibfs.BankingApp.dto.Account;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	Account account = new Account();
	
	
	account.setAccountNumber("AD001");
	account.setAccountHolderName("Fatima");
	account.setAccountType("aving");
	account.setAddress("Abu Dhabi");
	account.setBalance(400);
	account.setContactNamer("0566322312");
	account.setActive(true);
	//account.setAccountCreated(LocalDate.now());
	
	System.out.println(account);
	System.out.println(account.toString());
	
	}


		


}				