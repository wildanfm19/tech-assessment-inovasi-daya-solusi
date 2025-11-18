package com.wildan.assesment.service;

import com.wildan.assesment.dto.TransactionDetailDTO;
import com.wildan.assesment.entity.TransactionDetails;
import com.wildan.assesment.repositories.TransactionDetailRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionServiceIImpl implements  TransactionService {

    private final TransactionDetailRepository transactionDetailRepository;

    private final ModelMapper modelMapper;



    @Override
    public List<TransactionDetailDTO> getAllTransactionDetails() {
        List<TransactionDetails> transactionDetails = transactionDetailRepository.findAll();

        List<TransactionDetailDTO> transactionDetailsDTOS = transactionDetails.stream()
                .map(transaction -> modelMapper.map(transaction , TransactionDetailDTO.class))
                .toList();

        return transactionDetailsDTOS;
    }
}