package com.sinhvien.quanlisinhvien.service.dangki;

import com.sinhvien.quanlisinhvien.entity.DangKi;
import com.sinhvien.quanlisinhvien.entity.HocSinh;
import com.sinhvien.quanlisinhvien.entity.LopHoc;
import com.sinhvien.quanlisinhvien.repository.DangKiRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DangKiServiceImpl implements DangKiService{
    @Autowired
    private DangKiRepository dangKiRepository;


    @Override
    public DangKi dkHp(DangKi dangKi) {
        Optional<DangKi> dk = Optional.ofNullable(dangKiRepository.findByDkLopHoc_IdLopAndDkSinhVien_IdSinhVien(dangKi.getDkLopHoc(), dangKi.getDkSinhVien()));
        if(dk.isPresent()){
            if(dangKi.getTrangThaiDk() == "false"){
                return dangKiRepository.save(dangKi);
            }
    }
        return null;
}
}
