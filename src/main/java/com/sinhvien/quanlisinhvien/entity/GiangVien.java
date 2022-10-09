package com.sinhvien.quanlisinhvien.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GiangVien {
    @Id
    @Column(name = "Số_Hiệu_Giảng_Viên ")
    private String idGiangVien;

    @Column(name = "Tên_Giảng_Viên ")
    private String tenGv;

    @OneToMany(mappedBy = "giangVien")
    //@JsonManagedReference
    private List<LopHoc> lopHocs;
}
