package com.sinhvien.quanlisinhvien.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class DangKi {
    @Id
    @GeneratedValue
    private int stt;

    private String trangThaiDk;
    private int count;
    private LocalDate ngayDk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idLop")
    @JsonBackReference
    private LopHoc dkLopHoc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSinhVien")
    @JsonBackReference
    private HocSinh dkSinhVien;


}
