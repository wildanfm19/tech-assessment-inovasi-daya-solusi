package com.wildan.assesment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "product_id")
    private String productID;


    private String productName;

    private String amount;

    private String customerName;

    private Integer status;

    private LocalDateTime transactionDate;

    private String createBy;

    private LocalDateTime createOn;



}
