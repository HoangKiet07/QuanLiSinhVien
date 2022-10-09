package com.sinhvien.quanlisinhvien.repository;

import com.sinhvien.quanlisinhvien.entity.HocSinh;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HocSinhRepository extends JpaRepository<HocSinh, String> {

    @EntityGraph(attributePaths = {"lopHocs","dkSinhVien2"})
   // @Query("select a from HocSinh a")
    List<HocSinh> findAll();
}
