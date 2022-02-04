package com.devtech.poc.webfluxmysql.repository;

import com.devtech.poc.webfluxmysql.domain.ATMTransaction;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ATMTransactionRepository extends ReactiveCrudRepository<ATMTransaction, Long> {}
