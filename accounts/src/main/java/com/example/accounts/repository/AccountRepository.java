package com.example.accounts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.accounts.model.Account;
import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {   
   List<Account> findByAccountCustomerId(String customerId);
}
