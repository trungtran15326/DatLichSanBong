package com.example.demo.entity;


public class Booking {

  private long id;
  private long khachHangId;
  private long sanBongId;
  private long timeSlotId;
  private java.sql.Date ngay;
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


  public long getKhachHangId() {
    return khachHangId;
  }

  public void setKhachHangId(long khachHangId) {
    this.khachHangId = khachHangId;
  }


  public long getSanBongId() {
    return sanBongId;
  }

  public void setSanBongId(long sanBongId) {
    this.sanBongId = sanBongId;
  }


  public long getTimeSlotId() {
    return timeSlotId;
  }

  public void setTimeSlotId(long timeSlotId) {
    this.timeSlotId = timeSlotId;
  }


  public java.sql.Date getNgay() {
    return ngay;
  }

  public void setNgay(java.sql.Date ngay) {
    this.ngay = ngay;
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
