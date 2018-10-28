package com.marsel.proximaBank.dao;

import java.util.List;

import com.marsel.proximaBank.domain.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

