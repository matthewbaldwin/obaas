package com.example.accounts.controller;



import com.example.accounts.repository.AccountRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import com.example.accounts.model.Account;


@RestController
@RequestMapping("/api/v1")
public class AccountsController {

    final AccountRepository accountRepository;

    public AccountsController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/accounts")
    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/hello")
    public String ping() {
        return "Hello from Spring Boot";
    }

}
