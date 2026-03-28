package com.example.demo.entity;


public class TimeSlot {

  private long id;
  private java.sql.Time gioBatDau;
  private java.sql.Time gioKetThuc;
  private String deleted;
  private java.sql.Timestamp createdAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public java.sql.Time getGioBatDau() {
    return gioBatDau;
  }

  public void setGioBatDau(java.sql.Time gioBatDau) {
    this.gioBatDau = gioBatDau;
  }


  public java.sql.Time getGioKetThuc() {
    return gioKetThuc;
  }

  public void setGioKetThuc(java.sql.Time gioKetThuc) {
    this.gioKetThuc = gioKetThuc;
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
