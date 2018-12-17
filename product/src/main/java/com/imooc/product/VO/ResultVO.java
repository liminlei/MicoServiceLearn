package com.imooc.product.VO;

import lombok.Data;

/**
 * HTTP请求返回的最外层对象
 * Created by Administrator on 2018-12-17.
 */
@Data
public class ResultVO<T> {

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
