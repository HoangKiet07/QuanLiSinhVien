package com.sinhvien.quanlisinhvien.controller;

import com.sinhvien.quanlisinhvien.entity.HocSinh;
import com.sinhvien.quanlisinhvien.entity.ResponseHocSinh;
import com.sinhvien.quanlisinhvien.service.hocsinh.HocSinhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hocsinh")
public class HocSinhController {

    @Autowired
    private HocSinhService hocSinhService;

    @GetMapping("/getall")
    List<HocSinh> findAll(){
        return hocSinhService.findAll();
    }

    @GetMapping("/{id}")
    ResponseEntity<ResponseHocSinh> foundById(@PathVariable String id){
        Optional<HocSinh> findId = hocSinhService.findById(id);
        if(findId.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseHocSinh("OK", "Found Id Successfull", findId)
            );
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseHocSinh("Not Found", "Failed To Find", "")
            );
        }
    }

    @PostMapping("/add")
    ResponseEntity<ResponseHocSinh> addHocSinh(@RequestBody HocSinh hocSinh){
        HocSinh foundId = hocSinhService.foundId(hocSinh);
        if (foundId != null){
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseHocSinh("OK", "Add Student Successful",foundId)
            );
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseHocSinh("NOT_FOUND", "Student Were Present", "")
            );
        }
    }

    @DeleteMapping("/{id}")
    ResponseEntity<ResponseHocSinh> deleteHocsinh(@PathVariable String id) {
        if (hocSinhService.survive(id)) {
            hocSinhService.deleteStudent(id);
            return ResponseEntity.status(HttpStatus.OK).body(
                    new ResponseHocSinh("OK", "SUCCSESSFUL","")
            );
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                    new ResponseHocSinh("NOT FOUND", "NOT SURVIVE", "")
            );
        }
    }
}
