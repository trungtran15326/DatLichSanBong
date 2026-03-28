package com.example.demo.entity;


public class HoaDon {

  private long id;
  private long bookingId;
  private long nhanVienId;
  private double tongTien;
  private String trangThai;
  private String phuongThuc;
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


  public long getNhanVienId() {
    return nhanVienId;
  }

  public void setNhanVienId(long nhanVienId) {
    this.nhanVienId = nhanVienId;
  }


  public double getTongTien() {
    return tongTien;
  }

  public void setTongTien(double tongTien) {
    this.tongTien = tongTien;
  }


  public String getTrangThai() {
    return trangThai;
  }

  public void setTrangThai(String trangThai) {
    this.trangThai = trangThai;
  }


  public String getPhuongThuc() {
    return phuongThuc;
  }

  public void setPhuongThuc(String phuongThuc) {
    this.phuongThuc = phuongThuc;
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
