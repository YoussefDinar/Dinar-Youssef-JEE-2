package org.sid.bankaccountservice.entities;


import jakarta.persistence.*;
import lombok.*;
import org.sid.bankaccountservice.enums.AccountType;
import java.util.Date;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class BankAccount {
    @Id
    private String id;

    private Date creationAt;
    private Double balance;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;

}