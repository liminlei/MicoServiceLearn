package com.imooc.product.utils;

import com.imooc.product.VO.ResultVO;
import com.imooc.product.enums.ResultEnum;

/**
 * Created by Administrator on 2018-12-17.
 */
public class ResultVOUtil {

    public static <T> ResultVO success(T data){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(ResultEnum.SUCCESS.getCode());
        resultVO.setMsg(ResultEnum.SUCCESS.getMsg());
        resultVO.setData(data);
        return resultVO;
    }
}
