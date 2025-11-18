package com.wildan.assesment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDetailDTO {

    private Integer id;

    private Integer productID;

    private String productName;

    private Integer amount;

    private String customerName;

    private Integer status;

    private LocalDateTime transactionDate;

    private String createdBy;

    private LocalDateTime createOn;
}
