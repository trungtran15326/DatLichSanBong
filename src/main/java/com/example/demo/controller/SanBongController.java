package com.example.demo.controller;


import com.example.demo.response.SanBongResponse;
import com.example.demo.service.SanBongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/san-bong")
public class SanBongController {

    @Autowired
    private SanBongService sanBongService;

    @GetMapping("hien-thi")
    public List<SanBongResponse> hienThi(){
        return sanBongService.getAll();
    }
}
