package com.sinhvien.quanlisinhvien.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseHocSinh {
    private String stutus;
    private String message;
    private Object data;


}
