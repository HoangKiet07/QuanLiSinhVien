package com.sinhvien.quanlisinhvien.service.hocsinh;

import com.sinhvien.quanlisinhvien.entity.HocSinh;

import java.util.List;
import java.util.Optional;

public interface HocSinhService {
    List<HocSinh> findAll();
    Optional<HocSinh> findById(String id);
    HocSinh foundId (HocSinh hocSinh);
    boolean survive(String id);
    void deleteStudent(String id);
}
