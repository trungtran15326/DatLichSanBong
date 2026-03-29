package com.example.demo.repository;

import com.example.demo.entity.SanBong;
import com.example.demo.response.SanBongResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanBongRepository extends JpaRepository<SanBong, Long> {

    @Query("""
    SELECT new com.example.demo.response.SanBongResponse(sb.ten, sb.diaChi, sb.loaiSan, sb.gia, sb.moTa, sb.trangThai)
    FROM SanBong sb
    WHERE sb.deleted = false
""")
    List<SanBongResponse> getStadiumList();
}
