package com.marsel.proximaBank.dao;

import java.util.List;

import com.marsel.proximaBank.domain.PrimaryTransaction;
import org.springframework.data.repository.CrudRepository;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
