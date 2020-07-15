package com.crud.example.controller;

import com.crud.example.service.AccountService;
import com.crud.example.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8086")
@RestController
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping("/account")
    public Account save(@RequestBody Account account) {
        return service.saveAccount(account);
    }

    @PostMapping("/addaccounts")
    public List<Account> addAccounts(@RequestBody List<Account> accounts) {
        return service.saveAccounts(accounts);
    }

    @GetMapping("/findall")
    public List<Account> findAllAccounts() {
        return service.getAccounts();
    }

    @GetMapping("/account/account-id/{id}")
    public Account findById(@PathVariable int id) {
        return service.getAccountById(id);
    }

    @GetMapping("/account/account-first-name/{firstname}")
    public Account findByFirstname(@PathVariable String firstname) {
        return service.getAccountByName(firstname);
    }

    @PutMapping("/update")
    public Account updateAccount(@RequestBody Account Account) {
        return service.updateAccount(Account);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAccount(@PathVariable int id) {
        service.deleteAccount(id);
    }
}
