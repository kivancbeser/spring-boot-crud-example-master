package com.crud.example.repository;

import com.crud.example.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {
    Account findByFirstname(String firstname);
}

