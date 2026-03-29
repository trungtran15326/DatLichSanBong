package com.example.demo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class SanBongResponse {


    private String ten;


    private String diaChi;


    private String loaiSan;


    private BigDecimal gia;


    private String moTa;


    private Boolean trangThai;



}
