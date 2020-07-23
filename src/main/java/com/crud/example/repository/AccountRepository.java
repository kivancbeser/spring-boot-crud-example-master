package com.crud.example.repository;

import com.crud.example.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {
    //We can add spesific queries in there and get data.
}

