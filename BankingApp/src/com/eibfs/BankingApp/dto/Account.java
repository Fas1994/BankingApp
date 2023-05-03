package com.eibfs.BankingApp.dto;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Data
@ToString(exclude ="accountCreated")


public class Account {

	private String accountHolderName;
	private String accountNumber;
	private float balance;
	private String accountType;
	private String contactNamer;
	private String address;
	
	
	//in a datetime format
	// don't want setter method
	
	@Getter(value = AccessLevel.NONE)
	@Setter(value = AccessLevel.NONE)
	private LocalDateTime accountCreated = LocalDateTime.now();
	//any boolean filed will start with is.
	private boolean isActive;
	
	@Override
	public String toString() {
		return "Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber + ", balance="
				+ balance + ", accountType=" + accountType + ", contactNamer=" + contactNamer + ", address=" + address
				+ ", accountCreated=" + accountCreated.format(DateTimeFormatter.ofPattern("dd-MM-YYYY  HH:MM:SS"))+ "]";
	}
	
	
	
}
