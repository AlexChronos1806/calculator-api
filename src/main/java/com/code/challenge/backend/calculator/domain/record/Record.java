package com.code.challenge.backend.calculator.domain.record;

import com.code.challenge.backend.calculator.domain.operation.Operation;
import com.code.challenge.backend.calculator.domain.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Table(name = "operations")
@Entity(name = "Operation")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "operation_id")
    private Operation operation;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private Double amount;

    @Column(name = "user_balance")
    private Double userBalance;

    @Column(name = "operation_response")
    private String userResponse;

    private LocalDate date;
}
