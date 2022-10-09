package com.sinhvien.quanlisinhvien.repository;

import com.sinhvien.quanlisinhvien.entity.DangKi;
import com.sinhvien.quanlisinhvien.entity.HocSinh;
import com.sinhvien.quanlisinhvien.entity.LopHoc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DangKiRepository extends JpaRepository<DangKi, Integer> {

    public DangKi findByDkLopHoc_IdLopAndDkSinhVien_IdSinhVien(LopHoc idDkLopHoc, HocSinh idDkSinhVien);
}
