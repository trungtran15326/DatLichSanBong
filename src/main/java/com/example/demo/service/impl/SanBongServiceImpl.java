package com.example.demo.service.impl;

import com.example.demo.repository.SanBongRepository;
import com.example.demo.response.SanBongResponse;
import com.example.demo.service.SanBongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanBongServiceImpl implements SanBongService {

    @Autowired
    private SanBongRepository sanBongRepository;

    @Override
    public List<SanBongResponse> getAll() {
        return sanBongRepository.getStadiumList();
    }
}
