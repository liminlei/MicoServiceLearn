package com.imooc.product.enums;

import lombok.Data;
import lombok.Getter;

/**
 * 商品上下架状态
 * Created by Administrator on 2018-12-17.
 */
@Getter
public enum ProductStatus {
    UP(0, "在架"),
    DOWN(1, "下架")
    ;

    private Integer code;
    private String message;

    ProductStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
