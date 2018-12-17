package com.imooc.order.utils;

import com.imooc.order.VO.ResultVO;
import com.imooc.order.enums.ResultEnum;

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
