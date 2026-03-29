package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "SanBong")
public class SanBong {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

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

  @Column(name = "deleted")
  private String deleted;

  @Column(name = "create_at")
  private LocalDateTime createdAt;

  @Column(name = "update_at")
  private java.sql.Timestamp updatedAt;


}
