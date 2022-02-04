package com.devtech.poc.webfluxmysql.controller;

import com.devtech.poc.webfluxmysql.domain.ATMTransaction;
import com.devtech.poc.webfluxmysql.repository.ATMTransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/atm-transaction")
public class ATMTransactionController {

  final ATMTransactionRepository repository;

  @GetMapping
  public Flux<ATMTransaction> getAllATMTransactions() {
    return repository.findAll();
  }

  @PostMapping
  public Mono<ATMTransaction> createATMTransaction(@RequestBody ATMTransaction transaction) {
    transaction.setTransactionId(null);
    String sdsd = new String("sdsd");
    return repository.save(transaction);
  }
}
