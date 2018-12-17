package com.imooc.product.enums;

import lombok.Getter;

/**
 * Created by Administrator on 2018-12-17.
 */
@Getter
public enum ResultEnum {
    SUCCESS(0, "成功");

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
