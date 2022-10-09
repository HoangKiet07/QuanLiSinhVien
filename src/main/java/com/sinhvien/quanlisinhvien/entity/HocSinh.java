package com.sinhvien.quanlisinhvien.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "hoc_sinh")
@EqualsAndHashCode(exclude = "lopHocs")
public class HocSinh {
    @Id
    @Column(name = "Mã_Số_Sinh_Viên")
    private String idSinhVien;

    @Column(name = "Tên_Sinh_Viên")
    private String tenSv;

    @Column(name = "Ngày_Sinh")
    private LocalDate ngaySinh;

    @OneToMany(mappedBy = "hocSinh", fetch = FetchType.LAZY,cascade = CascadeType.ALL) // note
    @JsonManagedReference
    @JsonIgnore
    private Set<LopHoc> lopHocs= new HashSet<>();  // tim hieu tai sao it dung list trong truong hop nay

    @OneToMany(mappedBy = "dkSinhVien" , fetch = FetchType.LAZY) //note
    @JsonManagedReference
    @JsonIgnore
    private Set<DangKi> dkSinhVien2;   // tim hieu tai sao it dung list trong truong hop nay

//    @Override
//    public String toString(){
//        return "";
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        HocSinh hocSinh = (HocSinh) o;
//        return idSinhVien.equals(((HocSinh) o).getIdSinhVien());
//    }
//
//    @Override
//    public int hashCode() {
//        return 21;
//    }
}
