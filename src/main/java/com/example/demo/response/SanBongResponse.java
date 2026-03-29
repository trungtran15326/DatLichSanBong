package com.example.demo.response;

import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class SanBongResponse {

    @Column(name = "ten")
    private String ten;

    @Column(name = "dia_chi")
    private String diaChi;

    @Column(name = "loai_san")
    private String loaiSan;

    @Column(name = "gia")
    private double gia;

    @Column(name = "mo_ta")
    private String moTa;

    @Column(name = "trang_thai")
    private String trangThai;


    private String deleted;


    private LocalDateTime createdAt;


    private java.sql.Timestamp updatedAt;

}
