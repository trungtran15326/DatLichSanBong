package com.example.demo.entity;


public class BookingDichVu {

  private long id;
  private long bookingId;
  private long dichVuId;
  private long soLuong;
  private String deleted;
  private java.sql.Timestamp createdAt;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBookingId() {
    return bookingId;
  }

  public void setBookingId(long bookingId) {
    this.bookingId = bookingId;
  }


  public long getDichVuId() {
    return dichVuId;
  }

  public void setDichVuId(long dichVuId) {
    this.dichVuId = dichVuId;
  }


  public long getSoLuong() {
    return soLuong;
  }

  public void setSoLuong(long soLuong) {
    this.soLuong = soLuong;
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
