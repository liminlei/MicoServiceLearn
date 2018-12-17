package com.imooc.order.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * Created by Administrator on 2018-12-17.
 */
@Data
public class ProductVO {

    @JsonProperty("name")       //返回给前端的名称
    private String categoryName;    //事实上的后台名称，为了语义清晰

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;
}
