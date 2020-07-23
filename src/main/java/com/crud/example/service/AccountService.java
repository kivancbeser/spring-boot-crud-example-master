package com.crud.example.service;

import com.crud.example.entity.Account;
import com.crud.example.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository repository;

    /** This method allows the account to be saving.
     * @param account
     * @return Account
     */
    public Account saveAccount(Account account) {
        return repository.save(account);
    }

    /** This method allows the list of account to be saving.
     * @param accounts
     * @return List of Account
     */
    public List<Account> saveAccounts(List<Account> accounts) {
        return repository.saveAll(accounts);
    }

    /** This method find All accounts in db and return list of accounts.
     * @return List of Account
     */
    public List<Account> getAccounts() {
        return repository.findAll();
    }

    /**  This method find Account By Id
     * @param id
     * @return Account
     */
    public Account getAccountById(int id) {
        return repository.findById(id).orElse(null);
    }


    /** This method delete Account By Id
     * @param id
     */
    public void deleteAccount(int id) {
        repository.deleteById(id);
    }

    /** This method finding by Id which wants to updated Account(finding by Id) and update the Account
     * @param account
     * @return
     */
    public Account updateAccount(Account account) {
        Account existingAccount = repository.findById(account.getId()).orElse(null);
        existingAccount.setFirstname(account.getFirstname());
        existingAccount.setLastname(account.getLastname());
        existingAccount.setEmail(account.getEmail());
        existingAccount.setBirthdate(account.getBirthdate());
        existingAccount.setActive(account.getActive());
        return repository.save(existingAccount);
    }


}
