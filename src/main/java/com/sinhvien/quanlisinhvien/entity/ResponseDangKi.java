package com.sinhvien.quanlisinhvien.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseDangKi {
    private String status;
    private String message;
    private Object data;
}
