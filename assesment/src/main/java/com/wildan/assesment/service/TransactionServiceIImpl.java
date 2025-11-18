package com.wildan.assesment.service;

import com.wildan.assesment.dto.TransactionDetailDTO;
import com.wildan.assesment.entity.TransactionDetails;
import com.wildan.assesment.repositories.TransactionDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceIImpl implements  TransactionService {

    TransactionDetailRepository transactionDetailRepository;


    @Override
    public List<TransactionDetailDTO> getAllTransactionDetails() {
        List<TransactionDetails> transactionDetails =
    }
}