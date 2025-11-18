package com.wildan.assesment.service;

import com.wildan.assesment.dto.StatusDTO;
import com.wildan.assesment.entity.Status;
import com.wildan.assesment.repositories.StatusRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StatusServiceImpl implements  StatusService{

    private final ModelMapper modelMapper;

    private final StatusRepository statusRepository;

    @Override
    public List<StatusDTO> getAllStatus() {
        List<Status> statusList = statusRepository.findAll();
        List<StatusDTO> statusDTOList = statusList.stream()
                .map(status -> modelMapper.map(status , StatusDTO.class))
                .toList();

        return statusDTOList;
    }
}
