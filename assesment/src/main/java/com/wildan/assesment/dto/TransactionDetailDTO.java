package com.wildan.assesment.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDetailDTO {

    private Integer id;

    private String productID;

    private String productName;

    private String amount;

    private String customerName;

    private Integer status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    private LocalDateTime transactionDate;

    private String createBy;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createOn;
}
