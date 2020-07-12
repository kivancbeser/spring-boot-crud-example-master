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

    @PostMapping("/addaccount")
    public Account addAccount(@RequestBody Account account) {
        return service.saveAccount(account);
    }

    @PostMapping("/addaccounts")
    public List<Account> addAccounts(@RequestBody List<Account> accounts) {
        return service.saveAccounts(accounts);
    }

    @GetMapping("/accounts")
    public List<Account> findAllAccounts() {
        return service.getAccounts();
    }

    @GetMapping("/accountById/{id}")
    public Account findAccountById(@PathVariable int id) {
        return service.getAccountById(id);
    }

    @GetMapping("/account/{firstname}")
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
