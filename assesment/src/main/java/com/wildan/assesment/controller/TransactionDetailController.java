package com.wildan.assesment.controller;

import com.wildan.assesment.dto.ResponseDTO;
import com.wildan.assesment.dto.TransactionDetailDTO;
import com.wildan.assesment.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/transaction-detail")
@RequiredArgsConstructor
public class TransactionDetailController {

    private TransactionService transactionService;

    @GetMapping("/all")
    public ResponseEntity<ResponseDTO> getAllTransactionDetails(){
        List<TransactionDetailDTO> transactionDetailDTO = transactionService.getAllTransactionDetails();
    }
}
