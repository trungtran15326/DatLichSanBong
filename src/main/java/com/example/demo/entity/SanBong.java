package com.example.demo.entity;


public class SanBong {

  private long id;
  private String ten;
  private String diaChi;
  private String loaiSan;
  private double gia;
  private String moTa;
  private String trangThai;
  private String deleted;
  private java.sql.Timestamp createdAt;
  private java.sql.Timestamp updatedAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTen() {
    return ten;
  }

  public void setTen(String ten) {
    this.ten = ten;
  }


  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }


  public String getLoaiSan() {
    return loaiSan;
  }

  public void setLoaiSan(String loaiSan) {
    this.loaiSan = loaiSan;
  }


  public double getGia() {
    return gia;
  }

  public void setGia(double gia) {
    this.gia = gia;
  }


  public String getMoTa() {
    return moTa;
  }

  public void setMoTa(String moTa) {
    this.moTa = moTa;
  }


  public String getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(String trangThai) {
    this.trangThai = trangThai;
  }


  public String getDeleted() {
    return deleted;
  }

  public void setDeleted(String deleted) {
    this.deleted = deleted;
  }


  public java.sql.Timestamp getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(java.sql.Timestamp createdAt) {
    this.createdAt = createdAt;
  }


  public java.sql.Timestamp getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(java.sql.Timestamp updatedAt) {
    this.updatedAt = updatedAt;
  }

}
