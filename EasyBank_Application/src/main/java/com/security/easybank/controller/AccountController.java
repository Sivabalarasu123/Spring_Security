package com.security.easybank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.security.easybank.entity.Accounts;
import com.security.easybank.repository.AccountsRepository;

@RestController
public class AccountController {

	@Autowired
	private AccountsRepository accountsRepository;
	@GetMapping("/myAccount")
	public Accounts getAccountDetails(@RequestParam int id) {
		Accounts accounts = accountsRepository.findByCustomerId(id);
		if(accounts != null) {
			return accounts;
		}else {
			return null;
		}
	}
}

