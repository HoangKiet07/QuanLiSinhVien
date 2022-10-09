package com.sinhvien.quanlisinhvien.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class PhongHoc {
    @Id
    @Column(name = "Tên_Phòng")
    private String tenPhong;

    @Column(name = "Số_Lượng_SV_Có_Thể_Chứa")
    private int soLuong;

    @OneToMany(mappedBy = "phongHoc") //note
    private List<LopHoc> lopHoc;
}
