package com.devtech.poc.webfluxmysql.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("ATM_TRANSACTION")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ATMTransaction {
  @Id private Long transactionId;
  @Column private Long atmId;
  @Column private String transactionType;
  @Column private Double amount;
}
