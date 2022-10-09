package com.sinhvien.quanlisinhvien.controller;

import com.sinhvien.quanlisinhvien.entity.DangKi;
import com.sinhvien.quanlisinhvien.entity.ResponseDangKi;
import com.sinhvien.quanlisinhvien.service.dangki.DangKiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/dangki")
public class DangKiController {
    @Autowired
    private DangKiService dangKiService;

    @PostMapping("")
    ResponseEntity<ResponseDangKi> dk(DangKi dangKi){
        DangKi dk = dangKiService.dkHp(dangKi);
        if(dk == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ResponseDangKi("NOT FOUND", "Registered","")
            );
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseDangKi("OK", "Registered Successful", dangKi)
            );
        }
    }
}
