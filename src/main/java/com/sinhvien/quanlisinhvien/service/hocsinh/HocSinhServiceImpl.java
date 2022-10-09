package com.sinhvien.quanlisinhvien.service.hocsinh;

import com.sinhvien.quanlisinhvien.entity.HocSinh;
import com.sinhvien.quanlisinhvien.repository.HocSinhRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HocSinhServiceImpl implements HocSinhService {
    @Autowired
    private HocSinhRepository hocSinhRepository;

    @Override
    public List<HocSinh> findAll() {
        List<HocSinh> test = hocSinhRepository.findAll();
        return test;
    }

    @Override
    public Optional<HocSinh> findById(String id) {
        Optional<HocSinh> find = hocSinhRepository.findById(id);
        return find;
    }

    @Override
    public HocSinh foundId(HocSinh hocSinh) {
        Optional<HocSinh> found = hocSinhRepository.findById(hocSinh.getIdSinhVien());
        if(found.isPresent()){
            return null;
        } else{
            return hocSinhRepository.save(hocSinh);
        }

    }

    @Override
    public boolean survive(String id) {
        boolean surviveHocSinh = hocSinhRepository.existsById(id);
        return surviveHocSinh;
    }

    @Override
    public void deleteStudent(String id) {
        hocSinhRepository.deleteById(id);
    }
}
