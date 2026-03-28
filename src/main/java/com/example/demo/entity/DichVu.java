package com.example.demo.entity;


public class DichVu {

  private long id;
  private String ten;
  private double gia;
  private String deleted;
  private java.sql.Timestamp createdAt;


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


  public double getGia() {
    return gia;
  }

  public void setGia(double gia) {
    this.gia = gia;
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

}
