package com.sinhvien.quanlisinhvien.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class MonHoc {
    @Id
    @Column(name = "Mã_Môn_Học")
    private String idMonHoc;

    @Column(name = "Tên_Môn_Học")
    private String tenMh;

    @Column(name = "Số_Tín_Chỉ")
    private int soTc;
    @OneToMany(mappedBy = "monHoc") // note
    private List<LopHoc> lopHoc;

}
