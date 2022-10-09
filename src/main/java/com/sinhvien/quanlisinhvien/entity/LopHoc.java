package com.sinhvien.quanlisinhvien.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import javax.persistence.*;
import javax.print.attribute.standard.MediaSize;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "lop_hoc")
public class LopHoc {
    @Id
    private String idLop;

    @OneToMany(mappedBy = "dkLopHoc")
    private List<DangKi> dkLopHoc2;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "idSinhvien")
    @JsonBackReference
   // @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    private HocSinh hocSinh;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idGiangVien")
    @JsonBackReference
   // @JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    private GiangVien giangVien;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idMonHoc")
    @JsonBackReference
    //@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    private MonHoc monHoc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenPhong")
    @JsonBackReference
    //@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
    private PhongHoc phongHoc;

    @Column(name = "Ngày_Mở_Đăng_Kí")
    private LocalDate ngayMoDk;

    @Column(name = "Ngày_Đóng_Đăng_Kí")
    private LocalDate ngayDongDk;

    @Column(name = "Số_Lượng_SV_Tối_Thiểu")
    private int slMin;

    @Column(name = "Số_Lượng_SV_Tối_Đa")
    private int slMax;




}
