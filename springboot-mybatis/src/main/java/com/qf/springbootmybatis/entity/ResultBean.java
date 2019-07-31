package com.qf.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author biubiu
 * @Data 2019/7/30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultBean<T> {
    private String respCode;
    private T data;
}
