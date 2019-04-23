package com.accounts.example.dao;

import java.util.List;

import com.accounts.example.model.Account;

public interface AccountRepository {
	List<Account> getAllAccounts();

	Account getAccount(String number);
}
