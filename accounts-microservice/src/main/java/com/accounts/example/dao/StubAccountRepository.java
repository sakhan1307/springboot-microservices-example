package com.accounts.example.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;


import com.accounts.example.model.Account;

@Repository
public class StubAccountRepository implements AccountRepository {

private Map<String, Account> accountsByNumber = new HashMap<String, Account>();
	
	public StubAccountRepository() {
		Account account = new Account(1000L, "Sk" , "1");
		accountsByNumber.put("1", account);
		account = new Account(2000L, "Pk" , "2");
		accountsByNumber.put("2", account);
		account = new Account(3000L, "Nk" , "3");
		accountsByNumber.put("3", account);
		Logger.getLogger(StubAccountRepository.class).info("Created StubAccountRepository");
	}

	public List<Account> getAllAccounts() {
		return new ArrayList<Account>(accountsByNumber.values());
	}

	public Account getAccount(String number) {
		return accountsByNumber.get(number);
	}
	



}
