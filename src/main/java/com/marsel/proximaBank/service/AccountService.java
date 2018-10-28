package com.marsel.proximaBank.service;

import java.security.Principal;

import com.marsel.proximaBank.domain.PrimaryAccount;
import com.marsel.proximaBank.domain.SavingsAccount;

public interface AccountService {
	
    PrimaryAccount createPrimaryAccount();
    
    SavingsAccount createSavingsAccount();
    
    void deposit(String accountType, double amount, Principal principal);
    
    void withdraw(String accountType, double amount, Principal principal);
    
}
